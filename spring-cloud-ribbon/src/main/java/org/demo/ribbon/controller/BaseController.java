package org.demo.ribbon.controller;

import org.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Exotic on 2017/10/16.
 */
@RestController
public class BaseController {
    // 服务列表
    @Autowired
    BaseService baseService;

    @RequestMapping("/test")
    public String test(){
        return baseService.sendHeartPackage();
    }
}
