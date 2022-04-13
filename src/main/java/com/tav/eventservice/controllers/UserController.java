package com.tav.eventservice.controllers;

import com.tav.eventservice.model.User;
import com.tav.eventservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("{id}")
    public User get(@PathVariable long id) {
        return userService.get(id);
    }
}
