package com.prime5chat.chatter.services;

import com.prime5chat.chatter.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServices {

    @Autowired
    MessageRepository messageRepository;

    public void saveMessage(String message){

    }

    //var chatString = JSON.stringify(theChatObject);
    //var oldChat = JSON.parse(theRetrievedChatString);
}
