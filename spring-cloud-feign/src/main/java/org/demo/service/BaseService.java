package org.demo.service;

import org.demo.service.hystrix.BaseHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过@FeignClient(serviceName)
 * serviceName指定调用的服务
 * @GetMapping("/heart") 指定调用服务的API
 * Created by Exotic on 2017/10/16.
 */
@FeignClient(value="service-heart",fallback = BaseHystrix.class)
public interface BaseService {
    @GetMapping("/heart")
    String heart(@RequestParam("token") String token);
}
