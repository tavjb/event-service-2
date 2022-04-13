package com.tav.eventservice.services;

import com.tav.eventservice.model.JwtWrapper;
import com.tav.eventservice.model.User;
import com.tav.eventservice.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthenticationManager authenticationManager;

    public JwtWrapper login(final User user) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getEmail(), String.valueOf(user.getPassword()))
            );
        } catch (final BadCredentialsException e) {
            throw new RuntimeException("Incorrect credentials");
        }

        return new JwtWrapper(JwtUtil.generateToken(user.getEmail()));
    }
}
