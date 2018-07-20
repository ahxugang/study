package com.geoffrey.service;

import com.alibaba.druid.pool.DruidDataSource;
import com.geoffrey.context.Context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class UserService {

    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("application.xml");
        Context.setSpringContext(factory);
        DruidDataSource dataSource = Context.getBean(DruidDataSource.class);
        Connection conn = null;
        try {
            conn = dataSource.getConnection();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {}
            }
        }
    }

}
