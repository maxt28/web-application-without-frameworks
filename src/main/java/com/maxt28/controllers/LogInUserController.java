package com.maxt28.controllers;

import com.maxt28.controllers.interfaces.Controller;
import com.maxt28.dao.UserDao;
import com.maxt28.model.User;
import com.maxt28.services.ValidationService;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;

public class LogInUserController implements Controller {
    Connection connection;
    private static final String PAGE_NAME = "message.jsp";

    public LogInUserController(Connection connection) {
        this.connection = connection;
    }

    public String process(HttpServletRequest req) {
        String name = req.getParameter("userName");
        String password = req.getParameter("password");
        UserDao userDao = new UserDao(connection);
        User user = userDao.findUserByName(name);
        if (!ValidationService.userExists(req, user, name)) {
            return PAGE_NAME;
        }
        if (!ValidationService.passwordCheck(req, user, password)) {
            return PAGE_NAME;
        }
        return PAGE_NAME;
    }
}
