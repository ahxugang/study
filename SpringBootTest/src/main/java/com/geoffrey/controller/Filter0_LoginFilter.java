package com.geoffrey.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "loginFilter", urlPatterns = {"/*"})
public class Filter0_LoginFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(Filter0_LoginFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("====================过滤器==========================");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
