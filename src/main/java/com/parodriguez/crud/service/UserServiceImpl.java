package com.parodriguez.crud.service;

import com.parodriguez.crud.dao.UserDao;
import com.parodriguez.crud.exception.UserNotFoundException;
import com.parodriguez.crud.repository.UserRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * Created by raul on 9/02/21.
 */
@Service
public class UserServiceImpl implements UserService{

  private final UserRepository repository;

  public UserServiceImpl(UserRepository repository) {
    this.repository = repository;
  }

  @Override
  public UserDao create(UserDao create) {
    return repository.save(create);
  }

  @Override
  public UserDao get(Long id) {
    return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
  }

  @Override
  public List<UserDao> getAll() {
    return repository.findAll();
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

  @Override
  public UserDao update(UserDao input, Long id) {
    repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    input.setId(id);
    return repository.save(input);
  }
}
