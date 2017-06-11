package com.tsingda.sample.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EcApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcApplication.class, args);
    }
}
