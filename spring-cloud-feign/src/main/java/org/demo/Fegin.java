package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients //开启Feign的功能
@SpringBootApplication
public class Fegin {

	public static void main(String[] args) {
		SpringApplication.run(Fegin.class, args);
	}
}
