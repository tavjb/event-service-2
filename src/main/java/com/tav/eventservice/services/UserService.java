package com.tav.eventservice.services;

import com.tav.eventservice.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User create(User user) {
        return user;
    }

    public User get(long id) {
        return new User(id, "x@x.com", "1234");
    }
}
