package com.tarking.microservice;

import com.tarking.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "microservice-user", configuration = RibbonConfiguration.class)
public class MovieRibbonApplication {

  public static void main(String[] args) {
    SpringApplication.run(MovieRibbonApplication.class, args);
  }

  @Bean
  @LoadBalanced  //从服务注册中心及eureka获取服务实例列表，默认负载均衡策略：轮询
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
