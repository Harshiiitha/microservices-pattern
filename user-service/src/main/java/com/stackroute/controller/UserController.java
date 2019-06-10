package com.stackroute.controller;


import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsException;
import com.stackroute.repository.UserRepository;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @PostMapping("user")
    public ResponseEntity<?> saveUser(@RequestBody User user)
    {
        System.out.println("***********");
        ResponseEntity responseEntity;

        try
        {
            userService.saveUser(user);
            responseEntity=new ResponseEntity<String>("Successfullycreated", HttpStatus.CREATED);
        }
        catch(UserAlreadyExistsException ex)
        {
            responseEntity=new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);

        }
        return responseEntity;
    }

    @GetMapping("user")
    public ResponseEntity<?> getAllUsers()
    {
        return  new ResponseEntity<List<User>>(userService.getAllUsers(),HttpStatus.OK);
    }
}
