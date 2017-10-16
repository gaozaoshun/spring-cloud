package org.demo.controller;

import org.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Exotic on 2017/10/16.
 */
@RestController
public class BaseController {
    @Autowired
    BaseService baseService;

    @GetMapping("/heart")
    public String heart(){
        return baseService.heart();
    }
}
