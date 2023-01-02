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
    @Value("${java1234.mysql.common}")
    private String mysql;
    @Value("${java1234.redis.common}")
    private String redis;

    @Value("${java1234.crm.config}")
    private String crm;

    @Value("${java1234.oa.config}")
    private String oa;
    @GetMapping("/getConfigInfo")
    public String getConfigInfo(){
        return name + ":"+age;
    }

    @GetMapping("/getCRMConfigInfo")
    public String getCRMConfigInfo(){
        return mysql + ":"+redis+":"+crm;
    }
    @GetMapping("/getOAConfigInfo")
    public String getOAConfigInfo(){
        return mysql + ":"+redis+":"+oa;
    }
}
