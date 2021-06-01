package com.pengchun.spring.springmvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer //implements WebApplicationInitializer {
{

    public void onStartup(ServletContext servletContext) {

//        // Load Spring web application configuration
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(AppConfig.class);
//        context.register(MyWebApplicationInitializer.class);
//
//        // Create and register the DispatcherServlet
//        DispatcherServlet servlet = new DispatcherServlet(context);
//        ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/app/*");
    }
}