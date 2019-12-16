package com.prime5chat.chatter.controllers;

import com.prime5chat.chatter.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/chat.register")
    @SendTo("/topic/public")
    public Message register(@Payload Message message, SimpMessageHeaderAccessor headerAccessor){
        headerAccessor.getSessionAttributes().put("username", message.getSender());
        System.out.println("REGISTER METHOD HAS BEEN CALLED");
        System.out.println(message.getType());
        return message;
    }

    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
     public Message sendMessage(@Payload Message message){
        System.out.println("SENDMESSAGE METHOD HAS BEEN CALLED");
        System.out.println(message.getType());
        return message;
    }

    @MessageMapping("/chat.leave")
    @SendTo("/topic/public")
    public Message logout(@Payload Message message) {
        return message;
    }

    @MessageMapping("/chat.createUser")
    @SendTo("/topic/public")
    public Message createUser(@Payload Message message) {
        System.out.println("CREATEUSER METHOD HAS BEEN CALLED");
        return message;
    }

}
