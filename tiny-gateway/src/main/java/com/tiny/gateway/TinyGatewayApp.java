package com.tiny.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liss
 */
@EnableDiscoveryClient
@SpringBootApplication
public class TinyGatewayApp {
    public static void main(String[] args){
        SpringApplication.run(TinyGatewayApp.class, args);
    }
}
