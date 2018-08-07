package com.routefinder.routefinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class RouteFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RouteFinderApplication.class, args);
    }
}