package com.demo.ecomerce.contoller;

import com.demo.ecomerce.entity.User;
import com.demo.ecomerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user){

        return userService.registerNewUser(user);
    }

}
