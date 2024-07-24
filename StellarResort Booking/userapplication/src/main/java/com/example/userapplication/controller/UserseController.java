package com.example.userapplication.controller;

import com.example.userapplication.entity.Userse;
import com.example.userapplication.service.UserseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserseController {
    @Autowired
    UserseService userService;


    @PostMapping("/createUser")
    public Userse createUser(@RequestBody Userse usersEntity) {

        return userService.registerUser(usersEntity);
    }

    @GetMapping("/getuserById/{id}")
    public Optional<Userse> getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getUsers")
    public List<Userse> getUsers() {
        return userService.getUsers();
    }

    //update the user

    @PutMapping("/updateUsers/{id}")
    public Userse updateUser(@PathVariable Integer id, @RequestBody Userse user) {
        user.setuId(id);
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUserId/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}

