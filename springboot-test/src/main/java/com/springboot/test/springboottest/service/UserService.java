package com.springboot.test.springboottest.service;

import com.springboot.test.springboottest.entity.User;

public interface UserService {

    public User getUserById(Integer id);

    public Integer save(User user);
}
