package com.goxda.check;

import com.goxda.check.api.service.IMetadataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CheckApplicationTests {
    @Autowired
    private IMetadataService service;
    @Test
    void contextLoads() {
        service.saveBatch(Word.read());
    }

}
