package org.demo.service.hystrix;

import org.demo.service.BaseService;
import org.springframework.stereotype.Component;

/**
 * Created by Exotic on 2017/10/16.
 */
@Component
public class BaseHystrix implements BaseService{

    @Override
    public String heart(String token) {
        return "服务调用出错，已熔断！";
    }
}
