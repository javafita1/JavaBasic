package com.demo.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {
	
	 @Before("execution(* com.demo.service.*.saveStudent(..))")
	    public void beforeAdvice() {

	        System.out.println("Before Method Execution");

	    }
	 
	 @After("execution(* com.demo.service.*.*(..))")
	    public void afterAdvice() {

	        System.out.println("After Method Execution");

	    }
	 
	 @AfterReturning(pointcut ="execution(* com.demo.service.*.updateStudent(..))", returning = "result")
	    public void afterReturningAdvice(Object result) {

	        System.out.println("Returning : "+result);

	    }
	 
	 @AfterThrowing(pointcut= "execution(* com.demo.service.*.deleteStudent(..))",throwing="ex")
	    public void afterThowingAdvice(Exception ex) {

	        System.out.println("After Throwing Method Execution " +ex);

	    }
	 
	
	 @Around("execution(* com.demo.service.*.*(..))")
	 public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{

		 System.out.println("Before");

		    Object obj = pjp.proceed(); //target object

		    System.out.println("After");
		    
		    return obj;


	    }
	 
	 
//	 @Before("within(com.demo.service1.Vehicle)")
//	 public void before(){
//
//	     System.out.println("within()");
//	 }
//	 
//	 @Before("this(com.demo.service1.Vehicle)")
//	 public void before_this(){
//
//	     System.out.println("this()");
//	 }
//	 @Before("target(com.demo.service1.Vehicle)")
//	 public void before_target(){
//
//	     System.out.println("target()");
//	 }
	 
	 @Before("within(com.demo.service1.Car)")
	 public void before(){

	     System.out.println("within()");
	 }
	 
	 @Before("this(com.demo.service1.Vehicle)")
	 public void before_this(){

	     System.out.println("this()");
	 }
	 @Before("target(com.demo.service1.Vehicle)")
	 public void before_target(){

	     System.out.println("target()");
	 }

}
