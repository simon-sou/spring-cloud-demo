package com.simon.demo.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName Hello2Controller
 * @Description TODO
 * @Author Simon
 * @Date 2020/12/1   2:29 下午
 */

@FeignClient(name = "hello2")
public interface Hello2ApplicatoinService {

    @GetMapping(value = "hello2/getValue",produces = MediaType.APPLICATION_JSON_VALUE)
    String getValue();
}
