package com.furkanuyanik.graphdatabase.repository;

import com.furkanuyanik.graphdatabase.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;
import java.util.List;

public interface UserRepository  extends Neo4jRepository<User, Long> {

  @Query("MATCH (u:User)<-[r:RATED]-(m:Movie) RETURN u,r,m")
  Collection<User> getAllUsers();
  Collection<User> findByNameContaining(String name);
}
