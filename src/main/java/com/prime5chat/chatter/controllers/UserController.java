package com.prime5chat.chatter.controllers;

import com.prime5chat.chatter.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/chat.createUser")
    public Message createUser(@Payload Message message) {
        System.out.println("CREATEUSER METHOD HAS BEEN CALLED");
        return message;
    }

}
