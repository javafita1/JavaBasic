package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/employee")
	public String employee(Model model) {
		
		Employee emp =new Employee(101, "Selva", 50000);
		        
		model.addAttribute("employee",emp);
		
		return "employee";	
		
	}
	
	
	@GetMapping("/employee/{id}")
	public String employee(

	        @PathVariable int id,

	        Model model) {

	    model.addAttribute("id", id);

	    return "employee1";
	}
	
	@GetMapping("/form")
    public String showForm() {

        return "employeeForm";

    }

    @PostMapping("/register")
    public String register(

            @ModelAttribute Employee employee,

            Model model) {

        model.addAttribute("employee", employee);

        return "result";

    }



}
