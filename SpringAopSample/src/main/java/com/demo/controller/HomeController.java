package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.HomeService;
import com.demo.service1.HomeService1;

@Controller
public class HomeController {
	
	@Autowired
	HomeService service;
	
	@Autowired
	HomeService1 service1;
	
	@RequestMapping("/home")
    public String home() {

        service.saveStudent();

        return "home";

    }
	
	@RequestMapping("/home1")
    public String home1() {

        service1.saveStudent();

        return "home";

    }
	
	@RequestMapping("/update")
    public String update() {

        service.updateStudent();

        return "home";

    }
	
	@RequestMapping("/delete")
    public String delete() {

        service.deleteStudent();

        return "home";

    }
	
	

}
