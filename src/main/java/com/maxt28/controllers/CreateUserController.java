package com.maxt28.controllers;

import com.maxt28.controllers.interfaces.Controller;
import com.maxt28.dao.UserDao;
import com.maxt28.model.User;
import com.maxt28.services.MailService;
import com.maxt28.services.ValidationService;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;


public class CreateUserController implements Controller {
    private final Connection connection;
    private final String PAGE_NAME = "message.jsp";

    public CreateUserController(Connection connection) {
        this.connection = connection;
    }

    public String process(HttpServletRequest req) {
        String name = req.getParameter("userName");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String email = req.getParameter("email");
        if (!ValidationService.confirmPassword(req, password, confirmPassword)) {
            return PAGE_NAME;
        }
        User user = User.of(name, password, email);
        UserDao userDao = new UserDao(connection);
        userDao.create(user);
        req.setAttribute("message", "<p>Thanks for registration, " + name + "</p>");
        MailService.newUserCreated(name, email);
        return PAGE_NAME;
    }
}
