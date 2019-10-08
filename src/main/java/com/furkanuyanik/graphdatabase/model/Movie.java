package com.furkanuyanik.graphdatabase.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Movie {
  @Id
  private Long id;
  private String title;
  private String director;

  @Relationship(type = "RATED", direction = Relationship.INCOMING)
  private List<Movie> movies;

  public List<Movie> getMovies() {
    return movies;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }
}
