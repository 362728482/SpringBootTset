package com.springboot.test.springboottest.service.impl;


import com.springboot.test.springboottest.dao.UserDao;
import com.springboot.test.springboottest.entity.User;
import com.springboot.test.springboottest.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService1")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(Integer id){

        return userDao.get(id);
    }

    @Override
    public Integer save(User user){
        return userDao.insert(user);
    }
}
