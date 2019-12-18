package com.prime5chat.chatter.services;


import com.prime5chat.chatter.models.User;
import com.prime5chat.chatter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    private UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    public Iterable<User> getUsers() {
        return this.userRepository.findAll();
    }
}
