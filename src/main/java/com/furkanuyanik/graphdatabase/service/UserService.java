package com.furkanuyanik.graphdatabase.service;

import com.furkanuyanik.graphdatabase.model.User;
import com.furkanuyanik.graphdatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public Collection<User> getAll(){
    return userRepository.getAllUsers();
  }
  public Collection<User> findByNameContaining(String name){
    return userRepository.findByNameContaining(name);
  }
}
