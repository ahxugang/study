package com.geoffrey.dao;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BaseDao {

    @Autowired
    private DataSource dataSource;

    public final void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void close(Connection conn) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
    }

    public void close(Connection conn, Statement st, ResultSet rs) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
            }
        }
        if(st != null) {
            try {
                st.close();
            } catch (SQLException e) {
            }
        }
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
            }
        }
    }


}
