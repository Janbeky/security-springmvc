package com.heima.security.springmvc.init;

import com.heima.security.springmvc.config.ApplicationConfig;
import com.heima.security.springmvc.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

//在init包下定义Spring容器初始化类SpringApplicationInitializer，此类实现WebApplicationInitializer接口，
//Spring容器启动时加载WebApplicationInitializer接口的所有实现类
public class SpringApplicationInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
