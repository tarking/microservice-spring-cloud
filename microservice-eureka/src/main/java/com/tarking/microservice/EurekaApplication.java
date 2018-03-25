package com.tarking.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * application.yml和application.properties只能同时存在一个，否则启动时会报错
 */

@SpringBootApplication  //springboot应用
@EnableEurekaServer  // 作为eureka服务端
public class EurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaApplication.class, args);
  }
}
