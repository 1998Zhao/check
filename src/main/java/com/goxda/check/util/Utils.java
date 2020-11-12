package com.goxda.check.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.XmlUtil;
import org.w3c.dom.Document;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;


public class Utils {
    private Utils() {
    }

    public static String getMethodName(String name){
        String[] strs = name.split(" ");
        StringBuilder res = new StringBuilder("get");
        for (String str : strs) {
            str = StrUtil.upperFirst(str);
            res.append(str);
        }
        return res.toString();
    }
    public static void getPackageByXml(String xml) throws FileNotFoundException {
        //ElectronicDocumentsEncapsulationPackage pkg = new ElectronicDocumentsEncapsulationPackage();
        Map<String,Object> map;
        InputStream stream = new FileInputStream("D:\\a.xml");
        Document doc = XmlUtil.readXML(stream);
        map = XmlUtil.xmlToMap(doc);
        Map<String,Object> map1 = (Map<String, Object>) map.get("p:电子文件封装包");
        System.out.println(map1);
        List<String> set = new ArrayList<>();
        List<String> strings =getMapKeySet(map1,set);
        System.out.println(strings);
        System.out.println(strings.size());
    }
    public static List<String> getMapKeySet(Map<String,Object> map,List<String> set){
            map.forEach((s, o) -> {
                set.add(s);
                if (o.getClass().equals(HashMap.class)){
                    getMapKeySet((Map<String, Object>) o,set);
                }
            });
        return set;
    }

    public static void main(String[] args) {
        try {
            getPackageByXml("1");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
