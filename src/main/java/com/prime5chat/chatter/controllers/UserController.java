package com.prime5chat.chatter.controllers;

import com.prime5chat.chatter.models.Message;
import com.prime5chat.chatter.models.User;
import com.prime5chat.chatter.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    private UserServices userServices;

    @Autowired
    public UserController(UserServices userServices){
        this.userServices = userServices;
    }

    @MessageMapping("/chat.createUser")
    public Message createUser(@Payload Message message) {
        System.out.println("-----------------------------------");
        System.out.println(message.getSender());
        System.out.println(message.getType());
        System.out.println("-----------------------------------");
        return message;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<?> createUser(@RequestBody User user){
        return new ResponseEntity<>(this.userServices.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping(path = "/users")
    public ResponseEntity<Iterable<User>> getUsers(){
        return new ResponseEntity<>(this.userServices.getUsers(), HttpStatus.OK);
    }

}
