package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;

import config.AppConfig;
import dao.EmployeeDaoImpl;
import dao.IEmployeeDao;
import model.Employee;
import service.EmployeeServiceImpl;
import service.IEmployeeService;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		
		IEmployeeDao dao=context.getBean(EmployeeDaoImpl.class);
		
		IEmployeeService service= context.getBean(IEmployeeService.class);
		
//		It does not mean Spring creates an object of the interface IEmployeeService.
//		Instead, it means:
//		"Give me a bean that implements IEmployeeService which is EmployeeServiceImpl."
		
		//Insert
		
		Employee emp=new Employee( 104,"Priya","Testing",42000, "Madurai");
		try {       
		int rows= dao.save(emp);
		
		System.out.println("Insert Rows");
		System.out.println("Rows Inserted - "+rows);
		System.out.println(emp);
		} catch (DuplicateKeyException e) {

			System.out.println("Employee ID already exists.");

		}
		
		//select by Id
		System.out.println("Find Employee by Id");
		try {
		emp = dao.findById(103);
		System.out.println(emp);
		} catch (EmptyResultDataAccessException e) {

			System.out.println("Employee not found for given Id.");

		}
		
		//Select all Employee
		System.out.println("Find all Employee");
		List<Employee> employees = dao.findAll();
		for (Employee employee : employees) {
		    System.out.println(employee);
		}
		
		//update employee
		System.out.println("update Employee by Id");
		Employee emp1=new Employee( 101,60000);
		System.out.println("Rows updated - "+dao.update(emp1));
		
		//Delete Employee
		System.out.println("Delete Employee by Id");
		System.out.println("Rows Deleted - "+dao.delete(102));
		
		//Batch Insert
		System.out.println("Batch Insert");
		try {
		List<Employee> emps =  new ArrayList<>();
		       
		emps.add(new Employee(201,"John", "IT",50000,"Chennai"));
		emps.add(new Employee( 202,"David","HR",40000,"Madurai"));
		emps.add(new Employee(203,"Peter","Testing",45000,"Trichy"));
		        
		dao.batchInsert(emps);
		System.out.println("Batch Insert Successful");
		} catch (DuplicateKeyException e) {

			System.out.println("Employee ID already exists.");

		}
		
		//Transaction Management
		System.out.println("Transaction Management");
		service.transferAmount(203,202,10000);
		
		
	}

}
