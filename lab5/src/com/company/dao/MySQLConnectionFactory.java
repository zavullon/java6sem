package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionFactory implements ConnectionFactory {
    @Override
    public Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/catalog?user=zavullon&password=QEADZCwsx&serverTimezone=UTC");
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("Unable to connect to Mysql database");
        }

        return connection;
    }
}