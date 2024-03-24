package com.yangushan.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * created by yangushan
 * 2024/3/24 15:20
 */
public class User implements Serializable {

  private Long id;

  private String name;

  private Date hireTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getHireTime() {
    return hireTime;
  }

  public void setHireTime(Date hireTime) {
    this.hireTime = hireTime;
  }
}
