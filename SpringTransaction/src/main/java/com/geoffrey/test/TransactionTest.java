package com.geoffrey.test;


import com.geoffrey.bean.User;
import com.geoffrey.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TransactionTest {
    /**
     * 一定要注入代理类:因为代理类进行增强的操作
     */
    @Resource
    private UserService userService;

    @Test
    public void demo1() {
        User user = new User("aaa", "zhangsan", 18);
        userService.addUser(user);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
