package com.tav.eventservice.controllers;

import com.tav.eventservice.model.JwtWrapper;
import com.tav.eventservice.model.User;
import com.tav.eventservice.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("login")
@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping
    public JwtWrapper login(@RequestBody User user) {
        return authService.login(user);
    }
}
