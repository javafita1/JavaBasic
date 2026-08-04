package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy           //(proxyTargetClass = true)
@ComponentScan({"com.demo.Aspect","com.demo.controller","com.demo.service","com.demo.service1"})
public class SpringConfig {
	
	 @Bean
	    public InternalResourceViewResolver viewResolver() {

	        InternalResourceViewResolver resolver =
	                new InternalResourceViewResolver();

	        resolver.setPrefix("/WEB-INF/views/");
	        resolver.setSuffix(".jsp");

	        return resolver;
	    }

}
