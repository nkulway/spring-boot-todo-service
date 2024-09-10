package com.nick.todoapp.controller;

import com.nick.todoapp.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationController authenticationController;

    @Autowired
    private JwtUtil jwtUtil;
}
