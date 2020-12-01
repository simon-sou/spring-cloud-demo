package com.simon.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hello2Controller
 * @Description TODO
 * @Author Simon
 * @Date 2020/12/1   2:16 下午
 */

@RestController
@RequestMapping("hello2")
public class Hello2Controller {

    @Value("${hello2.value:mock}")
    public String value;

    @GetMapping(path = "getValue",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getValue(){
        return value;
    }
}
