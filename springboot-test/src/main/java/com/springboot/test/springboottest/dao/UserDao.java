package com.springboot.test.springboottest.dao;

import com.springboot.test.springboottest.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

     Integer insert( User user);

     User get(Integer id);
}
