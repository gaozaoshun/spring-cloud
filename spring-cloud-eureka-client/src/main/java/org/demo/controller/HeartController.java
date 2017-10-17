package org.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Exotic on 2017/10/16.
 */
@RestController
public class HeartController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/heart")
    public String sendHeart(String token){
        return "Topic_Heart_"+System.currentTimeMillis()+"_TOKEN_"+token+"_PORT_"+port;
    }
}
