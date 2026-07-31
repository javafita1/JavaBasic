package com.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletRegistration;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { SpringConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
    @Override
    protected void customizeRegistration(
            ServletRegistration.Dynamic registration) {

        MultipartConfigElement multipartConfig =
                new MultipartConfigElement(

                        "D:/upload",

                        10485760,

                        20971520,

                        0);

        registration.setMultipartConfig(
                multipartConfig);

    }

}
