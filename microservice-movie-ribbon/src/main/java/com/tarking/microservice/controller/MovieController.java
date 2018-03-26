package com.tarking.microservice.controller;

import com.tarking.microservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tuojinguo on 2018/2/27.
 */
@RestController
public class MovieController {

  /**
   * @Autowired默认是安照类型注入 启动类中方法名可以任意
   * @Bean public RestTemplate xxx(){ return new RestTemplate(); }
   */
  @Autowired
  private RestTemplate restTemplate;

  //microservice-user,VIP virtual IP
  @GetMapping(value = "/movie/{id}")
  public User findById(@PathVariable("id") Long id) {
    return this.restTemplate.getForObject("http://microservice-user/simple/" + id, User.class);
  }
}
