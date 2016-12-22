package com.maxt28.utils;

import com.maxt28.controllers.*;
import com.maxt28.controllers.interfaces.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MainServlet extends HttpServlet {
    Map<Request, Controller> controllers;

    @Override
    public void init() throws ServletException {
        controllers = new HashMap<Request, Controller>();
        controllers.put(Request.of("GET", "/"), new HomeController());
        controllers.put(Request.of("GET", "/home"), new HomeController());
        controllers.put(Request.of("GET", "/categories"), new CategoriesController(Factory.getConnection()));
        controllers.put(Request.of("GET", "/signIn"), new SignInController());
        controllers.put(Request.of("GET", "/signUp"), new SignUpController());
        controllers.put(Request.of("POST", "/signUp"), new CreateUserController(Factory.getConnection()));
        controllers.put(Request.of("POST", "/signIn"), new LogInUserController(Factory.getConnection()));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            handle(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            handle(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void handle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {
        Controller controller = controllers.get(Request.of(req.getMethod(), req.getRequestURI()));
        req.getRequestDispatcher(controller.process(req)).forward(req, resp);
    }
}
