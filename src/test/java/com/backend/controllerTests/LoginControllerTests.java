package com.backend.controllerTests;

import com.backend.models.User;
import com.backend.controllers.LoginController;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginControllerTests {
    @Test
    public void shouldReturnTrueForCorrectCredentials() {
        LoginController loginController = new LoginController();
        assertTrue(loginController.login(new User("addubari@gmail.com", "password")));
    }

    @Test
    public void shouldReturnFalseForIncorrectCredentials() {
        LoginController loginController = new LoginController();
        assertFalse(loginController.login(new User("addubari@gmail.com", "asdf")));
    }
}
