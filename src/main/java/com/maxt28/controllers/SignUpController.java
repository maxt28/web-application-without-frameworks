package com.maxt28.controllers;

import com.maxt28.controllers.interfaces.Controller;

import javax.servlet.http.HttpServletRequest;

public class SignUpController implements Controller {
    private static final String PAGE_NAME = "signUp.jsp";

    public String process(HttpServletRequest req) {
        return PAGE_NAME;
    }
}
