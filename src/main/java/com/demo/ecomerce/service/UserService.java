package com.demo.ecomerce.service;

import com.demo.ecomerce.dao.UserDao;
import com.demo.ecomerce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public User registerNewUser(User user){
        return userDao.save(user);
    }

}
