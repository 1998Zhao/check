package com.goxda.check.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

/**
 * @author zgq
 */
@Configuration
public class XMLTemplatesConfig {
    @Bean
    SpringResourceTemplateResolver xmlTemplateResolver(ApplicationContext appCtx) {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();

        templateResolver.setApplicationContext(appCtx);
        //指定模版前缀，即存放位置，默认是该地址
        templateResolver.setPrefix("classpath:/templates/");
        //指定模版后缀
        templateResolver.setSuffix(".xml");
        //指定使用‘XML’模式
        templateResolver.setTemplateMode(TemplateMode.XML);
        //指定使用‘UTF-8’编码
        templateResolver.setCharacterEncoding("UTF-8");
        //开启缓存
        templateResolver.setCacheable(true);

        return templateResolver;
    }

    @Bean
    SpringTemplateEngine templateEngine(ApplicationContext appCtx) {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setEnableSpringELCompiler(true);
        templateEngine.setTemplateResolver(xmlTemplateResolver(appCtx));
        return templateEngine;
    }

}
