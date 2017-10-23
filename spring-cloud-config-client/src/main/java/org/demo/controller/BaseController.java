package org.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaozs on 2017/10/17.
 */

@RefreshScope  // 用来刷新缓存中配置属性
@RestController
public class BaseController {
    @Value("${foo}")
    private String foo;
    @GetMapping("config")
    public String config(){
        return foo;
    }
}
