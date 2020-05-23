package com.company.dao;

import com.company.models.GenericItem;

import java.sql.SQLException;
import java.util.List;

public interface ItemDao {
    List<GenericItem> findAll() throws SQLException;

    GenericItem findById(int id) throws SQLException;

    void update(GenericItem item) throws SQLException;
}
