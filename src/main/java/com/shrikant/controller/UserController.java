package com.shrikant.controller;

import com.shrikant.entity.User;
import com.shrikant.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public int register(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }
}
