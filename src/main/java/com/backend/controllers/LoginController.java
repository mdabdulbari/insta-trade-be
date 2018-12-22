package com.backend.controllers;

import com.backend.models.User;
import com.backend.services.LoginService;
import org.springframework.web.bind.annotation.*;


@RestController
public class LoginController {
    @PostMapping("/login")
    @CrossOrigin
    public boolean login(@RequestBody User user) {
        return LoginService.authenticate(user);
    }
}
