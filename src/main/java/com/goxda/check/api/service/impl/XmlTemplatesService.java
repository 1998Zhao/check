package com.goxda.check.api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class XmlTemplatesService {
    @Autowired
    SpringTemplateEngine springTemplateEngine;
    public void test(){
        Map<String, String> pinfo = new HashMap<>();
        Context context = new Context();
        context.setVariable("pinfo", pinfo);
        pinfo.put("lastname", "gq");
        pinfo.put("firstname", "z");
        pinfo.put("country", "CN");
        log.info("---pinfo:{}", pinfo);
        String content = springTemplateEngine.process("templates", context);
        log.info("---xml:\n{}", content);
    }
}
