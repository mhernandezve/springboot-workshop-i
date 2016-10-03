package org.test.tvseries.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TvSerie {

  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  @ManyToMany(cascade=CascadeType.ALL)
  private List<Actor> actors;

  public TvSerie(String name) {
    this.name = name;
    this.actors = new ArrayList<>();
  }

  public TvSerie() {
    this.actors = new ArrayList<>();
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<Actor> getActors() {
    return actors;
  }

}
