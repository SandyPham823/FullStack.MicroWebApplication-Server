package com.prime5chat.chatter.repositories;

import com.prime5chat.chatter.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
