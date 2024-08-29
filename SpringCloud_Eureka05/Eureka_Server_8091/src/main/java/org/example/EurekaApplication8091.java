package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// 添加@EnableEurekaServer注解，指定当前工程为Eureka Server端
@EnableEurekaServer  //激活Eureka Server
public class EurekaApplication8091 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication8091.class,args);
    }
}
