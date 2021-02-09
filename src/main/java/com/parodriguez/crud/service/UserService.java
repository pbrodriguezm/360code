package com.parodriguez.crud.service;

import com.parodriguez.crud.dao.UserDao;

import java.util.List;
import java.util.Optional;

/**
 * Created by raul on 9/02/21.
 */
public interface UserService {
  UserDao create(UserDao create);

  UserDao get(Long id);

  List<UserDao> getAll();

  void delete(Long id);

  UserDao update(UserDao input, Long id);
}
