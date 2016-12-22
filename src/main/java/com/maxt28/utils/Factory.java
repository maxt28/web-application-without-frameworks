package com.maxt28.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Factory {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "login", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (connection != null) {
        }
        return connection;
    }
}
