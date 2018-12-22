package com.backend.services;

import com.backend.models.User;

public class LoginService {

    public static boolean authenticate(User user) {
        return user.getEmail().equals("addubari@gmail.com") && user.getPassword().equals("password");
    }
}
