package com.example.JPAbasicapril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
     public String addUser(User user){

         userRepository.save(user);

         return "User added successfully";
     }

     public List<User> getUser(){

         return userRepository.findAll();
     }

     public User getUserById(int id){

         return userRepository.findById(id).get();
     }

     // Delete all the users

    // Delete user by id

    // Update the name of the user with a particular userId
}
