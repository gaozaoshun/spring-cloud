package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Exotic on 2017/10/16.
 */
@EnableEurekaClient
@SpringBootApplication
public class Client_1 {

    public static void main(String[] args) {
        SpringApplication.run(Client_1.class, args);
    }
}
