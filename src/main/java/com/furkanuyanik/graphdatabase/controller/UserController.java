package com.furkanuyanik.graphdatabase.controller;

import com.furkanuyanik.graphdatabase.model.User;
import com.furkanuyanik.graphdatabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/user")
public class UserController {
  @Autowired
  UserService userService;

  @GetMapping
  public Collection<User> getAll(){
    return userService.getAll();
  }

  @GetMapping("/{name}")
  public Collection<User> findByNameContaining(@PathVariable String name){
    return userService.findByNameContaining(name);
  }
}
