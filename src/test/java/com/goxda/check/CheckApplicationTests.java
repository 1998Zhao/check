package com.goxda.check;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.goxda.check.api.entity.MetadataRuleImage;

import com.goxda.check.api.service.*;
import com.goxda.check.api.service.impl.XmlTemplatesService;
import com.goxda.check.api.service.impl.XmlTransferMap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CheckApplicationTests {
    @Autowired
    private XmlTemplatesService templatesService;
    @Autowired
    private IMetadataRuleImageService iMetadataRuleService;
    @Autowired
    private IAccessionMetadataService s;
    @Autowired
    private ITransmissionMetadataService service;
    @Autowired
    private IMetadataRulePkgService iService;
    @Autowired
    XmlTransferMap map;
    @Test
    void contextLoads() {
        QueryWrapper<MetadataRuleImage> wrapper = new QueryWrapper<>();
        wrapper.eq("type",1);
        List<MetadataRuleImage> list = iMetadataRuleService.list(wrapper);
        StringBuilder sb = new StringBuilder();
        sb.append("create table audio_visual_metadata ( \n `id` int not null AUTO_INCREMENT,\n ");
        for (MetadataRuleImage metadataRule : list) {
            sb.append("`").append(t(metadataRule.getName())).append("` ");
            String type = metadataRule.getDataType();
            if (type.equals("字符型")||metadataRule.getDataType().equals("——")){
                sb.append("varchar(55) ");
            }
            else if ("数值型".equals(type)){
                sb.append("int ");
            }
            else if ("日期时间型".equals(type)){
                sb.append("datetime ");
            }
            else {
                sb.append("varchar(55) ");
            }
            if ("必选".equals(metadataRule.getConstraintion())){
                sb.append("not null ");
            }
            sb.append("comment '").append(metadataRule.getNameCn()).append("', \n");
        }
        sb.append("PRIMARY KEY (`id`)\n)");
        System.out.println(sb);
    }
    public String t(String name){
        if (name.contains(" ")){
            name = name.replaceAll(" ","_");
        }
        return name;
    }
    @Test
    public void test(){
        map.getPackageByXml("");

    }
}
