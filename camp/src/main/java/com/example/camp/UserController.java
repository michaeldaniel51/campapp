package com.example.camp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser (){
        return userService.getAllUser();
    }

    @PostMapping("/users")
    public void  addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("/users/{id}")
    public void getUserById(@PathVariable long id){
        userService.findById(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable long id){
        userService.deleteById(id);
    }

    @PutMapping("/users")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @GetMapping("/users/firstname/{firstname}")
    public Optional<User> getUserByFirstName(@PathVariable String firstname){
        return userService.getUserByFirstName(firstname);
    }

    @GetMapping("/users/lastname/{lastname}")
    public Optional<User> getUserByLastname(@PathVariable String lastname){
        return userService.getUserByLastName(lastname);
    }

    @GetMapping("/users/email/{email}")
    public User getByEmail(@PathVariable("email") String email) {
        return userService.getUserByEmail(email).get();
    }

    @GetMapping("/some")
    public List<User> getSomeUser(){
        return userService.getSomeUser();
    }
    @GetMapping("/some/{id}")
    public User getById(@PathVariable String id){
        return userService.findSomeUserById(id);
    }

    @DeleteMapping("/some/{id}")
    public void deleteById(@PathVariable String id){
        userService.deleteSomeUserById(id);
    }

    @PostMapping("/some")
    public void addSome(@RequestBody User user){
        userService.addSomeUser(user);
    }

    @PutMapping("/some")
    public void updateSomeUser(@RequestBody User user) throws Exception {
        userService.updateSomeUser(user);
    }
}
