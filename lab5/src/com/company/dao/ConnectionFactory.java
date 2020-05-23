package com.company.dao;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection getConnection();
}
