package com.maxt28.dao;

import com.maxt28.model.Category;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CategoryDao extends AbstractDao {
    public CategoryDao(Connection connection) {
        super(connection);
    }

    public ArrayList<Category> getAllCategories() {
        ArrayList<Category> categories = new ArrayList<Category>();
        try {
            String query = "SELECT name,type,description FROM categories";
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()) {
                Category category = Category.of(
                        resultSet.getString("name"),
                        resultSet.getString("type"),
                        resultSet.getString("description")
                );
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
}
