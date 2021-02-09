package com.parodriguez.crud.exception;

/**
 * Created by raul on 9/02/21.
 */
public class UserNotFoundException extends RuntimeException{

  public UserNotFoundException(Long id) {
    super(String.format("Could not find user with id [%s]", id));
  }

}
