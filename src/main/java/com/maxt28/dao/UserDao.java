package com.maxt28.dao;

import com.maxt28.model.User;

import java.sql.*;

public class UserDao extends AbstractDao {

    public UserDao(Connection connection) {
        super(connection);
    }

    public User findUserByName(String name) {
        try {
            PreparedStatement st = connection.prepareStatement("SELECT * FROM users WHERE name = ?");
            st.setString(1, name);
            ResultSet results = st.executeQuery();
            if (results.next()) {
                return User.of(
                        results.getString("name"),
                        results.getString("password"),
                        results.getString("email")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void create(User user) {
        String name = user.getName();
        String password = user.getPassword();
        String email = user.getEmail();
        try {
            Statement statement = connection.createStatement();
            String query =
                    ("INSERT INTO users(name, password, email) VALUES ('" + name + "','" + password + "','" + email + "');");
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
