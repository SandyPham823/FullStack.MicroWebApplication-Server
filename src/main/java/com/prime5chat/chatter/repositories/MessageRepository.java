package com.prime5chat.chatter.repositories;

import com.prime5chat.chatter.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
