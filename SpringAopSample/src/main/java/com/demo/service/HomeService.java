package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	public void saveStudent() {

		        System.out.println("Saving Student...");

	}

	public String updateStudent() {
		
		  System.out.println("update Student...");
		
		return "updated Student";
		
	}

	public void deleteStudent() {
		
		System.out.println("deleting Student...");
		int i=10/0;
		
		System.out.println("Student deleted...");
		
	}

}
