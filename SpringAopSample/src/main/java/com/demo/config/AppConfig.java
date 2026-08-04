package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableAspectJAutoProxy           //(proxyTargetClass = true)
@ComponentScan({"com.demo.Aspect","com.demo.controller","com.demo.service","com.demo.service1"})
public class AppConfig {

}
