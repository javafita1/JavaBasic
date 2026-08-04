package com.demo.main;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.service1.Car;
import com.demo.service1.Vehicle;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Vehicle car= context.getBean(Car.class);
		
		//car.drive();
		
		Vehicle vehicle = context.getBean(Vehicle.class);
		vehicle.drive();
		
		
//		Changing from:
//			@Before("within(com.demo.service1.Car)")
//		 public void before(){
//
//		     System.out.println("within()");
//		 }
//		 
//		 @Before("this(com.demo.service1.Car)")
//		 public void before_this(){
//
//		     System.out.println("this()");
//		 }
//		 @Before("target(com.demo.service1.Car)")
//		 public void before_target(){
//
//		     System.out.println("target()");
//		 }
//		 To:
//			 @Before("within(com.demo.service1.Vehicle)")
//		 public void before(){
//
//		     System.out.println("within()");
//		 }
//		 
//		 @Before("this(com.demo.service1.Vehicle)")
//		 public void before_this(){
//
//		     System.out.println("this()");
//		 }
//		 @Before("target(com.demo.service1.Vehicle)")
//		 public void before_target(){
//
//		     System.out.println("target()");
//		 }
		
//		Also try with and without CGLIB Proxy by enabling (proxyTargetClass = true) in AppConfig file
		
	}

}
