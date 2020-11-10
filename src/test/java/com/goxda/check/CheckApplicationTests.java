package com.goxda.check;

import com.goxda.check.api.entity.MetadataRule;
import com.goxda.check.api.service.IAccessionMetadataService;
import com.goxda.check.api.service.IMetadataRuleImageService;
import com.goxda.check.api.service.IMetadataRuleService;
import com.goxda.check.api.service.IMetadataService;
import com.goxda.check.api.service.impl.XmlTemplatesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CheckApplicationTests {
    @Autowired
    private IMetadataRuleImageService service;
    @Autowired
    private IAccessionMetadataService accessionMetadataService;
    @Autowired
    private XmlTemplatesService templatesService;
    @Test
    void contextLoads() {
        List<MetadataRule> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("create table metadata ( \n `id` int not null AUTO_INCREMENT,\n ");
        for (MetadataRule metadataRule : list) {
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
        templatesService.test();
    }
}
