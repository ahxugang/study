package com.geoffrey.controller.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BaseFilter implements Filter {

    private static Map<String, String> sessionMap = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        sessionMap = new HashMap<String, String>();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest  = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        String sessionId = httpRequest.getSession().getId();
        if(httpRequest.getRequestURI().equals("/login.html")) {
            if(sessionId != null && !"".equals(sessionId.trim())) {
                if(sessionMap.containsKey(sessionId)) {
                    httpResponse.sendRedirect("/index.jsp");
                    return ;
                }
            }
            sessionMap.put(sessionId, "1");
            chain.doFilter(request, response);
            return ;
        }
        if(sessionId != null && !"".equals(sessionId.trim())) {
            if(sessionMap.containsKey(sessionId)) {
                chain.doFilter(request, response);
                return ;
            }
        }

        httpResponse.sendRedirect("/login.html");
        return ;
    }

    @Override
    public void destroy() {
        sessionMap.clear();
        sessionMap = null;
    }
}
