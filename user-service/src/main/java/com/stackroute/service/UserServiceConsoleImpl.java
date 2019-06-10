package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceConsoleImpl implements  UserService {


    @Override
    public User saveUser(User user) throws UserAlreadyExistsException {
        System.out.println(user);
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        System.out.println("Inside getallusers");
        return null;
    }
}
