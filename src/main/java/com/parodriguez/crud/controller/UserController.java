package com.parodriguez.crud.controller;

import com.parodriguez.crud.dao.UserDao;
import com.parodriguez.crud.service.UserService;

import javax.websocket.server.PathParam;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raul on 9/02/21.
 */
@RestController
@RequestMapping("/users/")
public class UserController implements Controller<UserDao, Long>{

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public UserDao create(@RequestBody UserDao input) {
    return userService.create(input);
  }

  @GetMapping("{id}")
  public UserDao get(@PathVariable Long id) {
    return userService.get(id);
  }

  @GetMapping
  public List<UserDao> getAll() {
    return userService.getAll();
  }

  @PutMapping("{id}")
  public UserDao update(
      @RequestBody UserDao input,
      @PathVariable Long id) {
    return userService.update(input, id);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable Long id) {
    userService.delete(id);
  }
}
