package com.goxda.check.api.service.impl;

import cn.hutool.core.util.XmlUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.goxda.check.api.entity.MetadataRule;
import com.goxda.check.api.entity.MetadataRulePkg;
import com.goxda.check.api.service.IMetadataRulePkgService;
import com.goxda.check.api.service.IMetadataRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author zgq
 */
@Service
@Slf4j
public class XmlTransferMap {
    static int count=0;
    @Autowired
    private IMetadataRulePkgService pkgService;
    @Autowired
    private IMetadataRuleService iService;
    /**
     * 获取其映射字典
     * @return 映射字典
     */
    public Map<String, String> getMap(){
        QueryWrapper<MetadataRulePkg> wrapper    = new QueryWrapper<>();
        wrapper.select("name_CN","name");
        List<Map<String,Object>> ms = pkgService.listMaps(wrapper);
        QueryWrapper<MetadataRule> wrapper1 = new QueryWrapper<>();
        wrapper1.select("name_CN","name");
        List<Map<String,Object>> ms1 = iService.listMaps(wrapper1);
        ms1.addAll(ms);
        Map<String,String> map = new HashMap<>();
        ms1.forEach(m->{
            map.put((String)m.get("name_CN"),(String) m.get("name"));
        });
        return map;
    }
    public  void getPackageByXml(String xml){
        try{
            Map<String,Object> map;
            InputStream stream = new FileInputStream("D:\\a.xml");
            Document doc = XmlUtil.readXML(stream);
            map = XmlUtil.xmlToMap(doc);
            Map<String,Object> map1 = (Map<String, Object>) map.get("p:电子文件封装包");
            System.out.println(map1);
            Map<String,String> strings =getMapRes(map1,new HashMap<>(0));
            System.out.println(strings);
            System.out.println(count);
        }
        catch (Exception e){
            log.error(e.toString());
        }
    }

    /**
     *
     * @param map 参数map
     * @param stringMap 结果map
     * @return 结果
     */
    public  Map<String, String> getMapRes(Map<String,Object> map,Map<String, String> stringMap) {
        Map<String, String> ma = getMap();
        map.forEach((k,v)->{
            String rk = k.substring(2);
            if (v.getClass().equals(HashMap.class)){
                System.out.println("*****"+k);
                getMapRes((Map<String, Object>) v,stringMap);
            }else {
                stringMap.put(ma.getOrDefault(rk, k), (String) v);
            }
        });
        return stringMap;
    }
}
