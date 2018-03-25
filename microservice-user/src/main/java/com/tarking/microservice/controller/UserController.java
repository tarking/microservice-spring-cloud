package com.tarking.microservice.controller;

import com.tarking.microservice.entity.User;
import com.tarking.microservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tuojinguo on 2018/2/27.
 */
@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  @GetMapping(value = "/simple/{id}")
  /**
   * 1、@GetMapping(value = "/simple/{id}")等同于@RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
   * 2、@PathVariable("id")和@PathVariable有什么不同?
   */
  public User findById(@PathVariable("id") Long id) {
    return userRepository.findOne(id);
  }

}
