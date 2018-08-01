package com.geoffrey.controller;

import com.geoffrey.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        if(!StringUtils.isBlank(userName) && !StringUtils.isBlank(pwd)) {
            if(userName.trim().equals(pwd.trim())) {
                HttpSession session = request.getSession(true);
                String sessionId = session.getId();
                LoginModel.setLoginModel(sessionId, new LoginModel(userName, pwd));
                response.sendRedirect("/index.jsp");
            }
        }
    }

    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
