package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrix // 启用断路器
@EnableHystrixDashboard // 启用Hystrix仪表盘
@EnableDiscoveryClient // 通过@EnableDiscoveryClient向服务中心注册
@SpringBootApplication
public class Ribbon {

	public static void main(String[] args) {
		SpringApplication.run(Ribbon.class, args);
	}

	@Bean // 向程序的ioc注入一个bean
	@LoadBalanced // 表明这个restRemplate开启负载均衡的功能
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
