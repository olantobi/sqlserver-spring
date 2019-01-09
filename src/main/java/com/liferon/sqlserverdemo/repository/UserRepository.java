package com.liferon.sqlserverdemo.repository;

import com.liferon.sqlserverdemo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByName(String name);
}
