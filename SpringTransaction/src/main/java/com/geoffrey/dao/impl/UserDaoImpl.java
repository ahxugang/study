package com.geoffrey.dao.impl;

import com.geoffrey.bean.User;
import com.geoffrey.dao.BaseDao;
import com.geoffrey.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

   /* @Autowired
    private DataSource dataSource;*/

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO USER(ID, USERNAME, AGE) VALUES(" + user.getId() + "," + user.getUserName() + "," + user.getAge() + ")";
        try {
            this.getConnection().prepareStatement(sql).execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/
}
