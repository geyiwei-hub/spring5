package com.antherd.webfluxdemo1.controller;

import com.antherd.webfluxdemo1.entity.User;
import com.antherd.webfluxdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

  // 注入service
  @Autowired
  private UserService userService;

  // id查询
  @GetMapping("/user/{id}")
  public Mono<User> getUserById(@PathVariable int id) {
    return userService.getUserById(id);
  }

  // 查询所有
  @GetMapping("/user")
  public Flux<User> getUser() {
    return userService.getAllUser();
  }

  // 添加
  @PostMapping("/user")
  public Mono<Void> saveUser(@RequestBody User user) {
    Mono<User> userMono = Mono.just(user);
    return userService.saveUserInfo(userMono);
  }
}
