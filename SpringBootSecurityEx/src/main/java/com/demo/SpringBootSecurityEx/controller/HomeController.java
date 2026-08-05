package com.demo.SpringBootSecurityEx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
    public String home() {
        return "Welcome";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin Page";
    }

    @GetMapping("/user")
    public String user() {
        return "User Page";
    }
    
    @GetMapping("/common")
    public String common() {
        return "Common Page";
    }
    
    @GetMapping("/secret")
    public String secret() {
        return "Secret Page";
    }

}
