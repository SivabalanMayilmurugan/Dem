package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Repository.GymRepository;

@RestController
@RequestMapping("/api/membership")
@CrossOrigin(origins ="*")
public class UserController {
    
    @Autowired
    private GymRepository g;

    @PostMapping
    public User saveUser(@RequestBody User user){
        return g.save(user);
    }
}
