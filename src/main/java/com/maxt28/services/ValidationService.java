package com.maxt28.services;

import com.maxt28.model.User;

import javax.servlet.http.HttpServletRequest;

public class ValidationService {
    public static boolean confirmPassword(HttpServletRequest req, String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            return true;
        }
        req.setAttribute("message", "<p>Passwords does not match!</p>");
        return false;
    }

    public static boolean userExists(HttpServletRequest req, User user, String name) {
        if (user != null) {
            return true;
        }
        req.setAttribute
                ("message", "<p>User " + name + " does not exist!</p>");
        return false;
    }

    public static boolean passwordCheck(HttpServletRequest req, User user, String password) {
        if (password.equals(user.getPassword())) {
            req.setAttribute
                    ("message", "<p>Welcome back, " + user.getName() + "! Your mail is " + user.getEmail() + "</p>");
            return true;
        }
        req.setAttribute
                ("message", "<p>Wrong password!</p>");
        return false;
    }
}
