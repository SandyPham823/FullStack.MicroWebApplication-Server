package com.prime5chat.chatter.repositories;

import com.prime5chat.chatter.models.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long> {
}
