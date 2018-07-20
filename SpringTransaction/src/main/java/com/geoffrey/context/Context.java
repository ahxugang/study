package com.geoffrey.context;

import org.springframework.context.ApplicationContext;

public class Context {

    private static ApplicationContext springContext;	//框架使用的Spring上下文

    public static ApplicationContext getSpringContext() {
        return springContext;
    }

    public static void setSpringContext(ApplicationContext context) {
        springContext = context;
    }

    /**
     * 通过名称获取系统SpringBean
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {
        return springContext.getBean(beanName);
    }
    /**
     * 通过类型获取系统SpringBean
     * @param className
     * @return
     */
    public static <T> T getBean(Class<T> className) {
        return (T)springContext.getBean(className);
    }
}
