package com.geoffrey.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginModel {
    private static Map<String, LoginModel> loginMsg = new ConcurrentHashMap<String, LoginModel>();

    public static LoginModel getLoginModel(String sessionId) {
        return loginMsg.get(sessionId);
    }

    public static void setLoginModel(String sessionId, LoginModel loginModel) {
        loginMsg.put(sessionId, loginModel);
    }

    private String userName;
    private String pwd;

    public LoginModel(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
