package com.tav.eventservice.security;

import com.tav.eventservice.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private static final Map<String, User> fakeDb = new HashMap<>();
    static {
        fakeDb.put("yair@gmail.com", new User(1L, "yair@gmail.com", "1234"));
        fakeDb.put("daniel.p@gmail.com", new User(2L, "daniel.p@gmail.com", "1234"));
        fakeDb.put("or.ch@gmail.com", new User(3L, "or.ch@gmail.com", "1234"));
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = fakeDb.get(email);
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                new ArrayList<>()
        );
    }
}


