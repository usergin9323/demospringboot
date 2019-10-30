package com.example.demospringboot.controller;

import com.example.demospringboot.bean.User;
import com.example.demospringboot.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "addUser")
    private void addUser(@RequestBody User user){
        userRepository.save(user);
    }
}
