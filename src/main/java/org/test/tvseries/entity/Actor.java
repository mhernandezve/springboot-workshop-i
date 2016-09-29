package org.test.tvseries.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor {

  @Id
  @GeneratedValue
  private Integer id;
  private String name;

  public Actor() {
  }

  public Actor(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

}
