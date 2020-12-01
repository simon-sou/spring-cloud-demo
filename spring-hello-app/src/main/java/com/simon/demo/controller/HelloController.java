package com.simon.demo.controller;

import com.simon.demo.feignClient.Hello2ApplicatoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${hello.value:mock}")
    public String value;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Hello2ApplicatoinService hello2ApplicatoinService;

    @GetMapping(path = "/getValue",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getValue(){
        return value;
    }

    @GetMapping(path = "getHello2Value",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHello2Value(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://hello2/hello2/getValue", String.class);
        if(forEntity.getStatusCode().is2xxSuccessful()){
            return forEntity.getBody();
        }else {
            return String.valueOf(forEntity.getStatusCodeValue());
        }
    }

    @GetMapping(path = "getHello2ValueByFeignClient",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHello2ValueByFeignClient(){
        return hello2ApplicatoinService.getValue();
    }

}
