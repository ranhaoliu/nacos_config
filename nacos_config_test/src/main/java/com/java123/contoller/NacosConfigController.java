package com.java123.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos")
@RefreshScope
public class NacosConfigController {
    @Value("${java1234.name}")
    private String name;
    @Value("${java1234.age}")
    private String age;
    @GetMapping("/getConfigInfo")
    public String getConfigInfo(){
        return name + ":"+age;
    }


}
