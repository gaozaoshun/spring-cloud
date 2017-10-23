package org.demo.controller;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Exotic on 2017/10/19.
 */
@RestController
public class BaseController {
    private static final Logger LOG = Logger.getLogger(BaseController.class.getName());
    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @GetMapping("sdbus_n")
    public String dybus(){
        LOG.log(Level.INFO,">>>>>>calling trace sdbus_n<<<<<<");
        return restTemplate.getForObject("http://127.0.0.1:10019/dybus_n",String.class);
    }

    @GetMapping("sdbus")
    public String dybusN(){
        LOG.log(Level.INFO,">>>>>>calling trace sdbus<<<<<<");
        return "i'm service-sdbus sdbus_n";
    }
}
