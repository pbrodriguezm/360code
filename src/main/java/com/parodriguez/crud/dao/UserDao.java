package com.parodriguez.crud.dao;

/**
 * Created by raul on 9/02/21.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDao {
  @Id
  @GeneratedValue
  private Long id;

  @Column
  private String name;

  @Column(name = "last_name")
  private String lastName;

  @Column
  private String password;

  @Column
  private String role;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserDao(Long id, String name, String lastName, String password, String role) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.password = password;
    this.role = role;
  }

  public UserDao() {
  }
}
