package dao;

import java.util.List;

import model.Employee;

public interface IEmployeeDao {

	int save (Employee employee);
	
	 Employee findById(int id);

	  List<Employee> findAll();
	  
	  int update(Employee employee);

	   int delete(int id);
	   
	   void batchInsert(List<Employee> employees);

	   void deductSalary(int fromId, double amount);

	   void addSalary(int toId, double amount);

}
