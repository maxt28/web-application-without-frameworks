package com.maxt28.dao;

import java.sql.Connection;

public class AbstractDao {
    final Connection connection;

    public AbstractDao(Connection connection) {
        this.connection = connection;
    }
}
