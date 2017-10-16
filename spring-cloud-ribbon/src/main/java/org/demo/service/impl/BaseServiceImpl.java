package org.demo.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Exotic on 2017/10/16.
 */
@Service
public class BaseServiceImpl implements BaseService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "isError")
    public String sendHeartPackage() {
        return restTemplate.getForObject("http://SERVICE-HEART/heart",String.class);
    }
    public String isError(){
        return "调用API服务出错，已熔断！";
    }
}
