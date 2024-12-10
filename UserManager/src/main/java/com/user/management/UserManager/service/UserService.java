package com.user.management.UserManager.service;

import com.user.management.UserManager.model.User;
import com.user.management.UserManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    //CRUD

    //Create
    @PostMapping
    private User createUser(@RequestBody User user){
        return user;
    }
    //Read
    @GetMapping
    private List<User> getUsers(){
        return userRepository.findAll();
    }
    //Update
//    @PatchMapping
//    private Optional<User> updateUser(@RequestBody User user){
//        userRepository.
//    }
    //Delete
    @DeleteMapping
    private boolean deleteUser(@PathVariable String id){
        userRepository.deleteById(id);
        return true;
    }
}
