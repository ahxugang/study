package com.geoffrey.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    private final static Logger logger = LoggerFactory.getLogger(ContextLoaderListener.class);

    @Override
    public void contextDestroyed(ServletContextEvent servletEvent) {
        // TODO Auto-generated method stub
        System.out.println("监听器销毁。。。。。。。");
        logger.info("监听器销毁。。。。。。。");
    }

    @Override
    public void contextInitialized(ServletContextEvent servletEvent) {
        logger.info("监听器启动。。。。。。。");
        ServletContext context = servletEvent.getServletContext();
        String configFile = context.getInitParameter("contextConfigLocation");
        if(configFile == null) {
            ApplicationContext factory = new ClassPathXmlApplicationContext("application.xml");
            Context.setSpringContext(factory);
        } else {
            XmlWebApplicationContext factory = new XmlWebApplicationContext();
            factory.setConfigLocation(configFile);
            factory.setServletContext(context);
            factory.refresh();
            Context.setSpringContext(factory);
        }
    }
}

