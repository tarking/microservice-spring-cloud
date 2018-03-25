package com.tarking.microservice.entity;

import java.math.BigDecimal;

/**
 * Created by tuojinguo on 2018/2/27.
 */
public class User {

  private long id;

  private String username;

  private String name;

  private Short age;

  private BigDecimal banlance;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Short getAge() {
    return age;
  }

  public void setAge(Short age) {
    this.age = age;
  }

  public BigDecimal getBanlance() {
    return banlance;
  }

  public void setBanlance(BigDecimal banlance) {
    this.banlance = banlance;
  }
}
