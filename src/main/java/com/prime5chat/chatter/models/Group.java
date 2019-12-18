package com.prime5chat.chatter.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Group {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private List<User> allowedUsers;

}
