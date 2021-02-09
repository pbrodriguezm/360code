package com.parodriguez.crud.repository;

import com.parodriguez.crud.dao.UserDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by raul on 9/02/21.
 */
@Repository
public interface UserRepository extends JpaRepository<UserDao, Long> {
}
