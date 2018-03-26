package com.tarking.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//name值一定要是eureka server中注册的名称，即需要做负载均衡的服务
public class RibbonConfiguration {

  @Autowired
  IClientConfig config;

  @Bean
  public IRule ribbonRule(IClientConfig config) {
    return new RandomRule();
  }
}
