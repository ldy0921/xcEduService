package com.xuecheng.test.freemarker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RestTemplateTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testRestTemplate() {
        ResponseEntity<Map> entity = restTemplate.getForEntity("http://localhost:31001/cms/config/get-model/5a791725dd573c3574ee333f", Map.class);
        System.out.println(entity);
    }
}
