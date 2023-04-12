package com.example.JPAbasicapril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user){

        String addingUser =  userService.addUser(user);

        return addingUser;
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUser(){
        return userService.getUser();
    }

    @GetMapping("/getUser")
    public User getUserById(@RequestParam("userId")int userId){
        return userService.getUserById(userId);
    }
}
