package com.maxt28.controllers;

import com.maxt28.controllers.interfaces.Controller;
import com.maxt28.dao.CategoryDao;
import com.maxt28.model.Category;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.util.ArrayList;

public class CategoriesController implements Controller {
    Connection connection;
    private static final String PAGE_NAME = "categories.jsp";

    public CategoriesController(Connection connection) {
        this.connection = connection;
    }

    public String process(HttpServletRequest req) {
        CategoryDao categoryDao = new CategoryDao(connection);
        ArrayList<Category> categories = categoryDao.getAllCategories();
        req.setAttribute("categories", categories);
        return PAGE_NAME;
    }
}
