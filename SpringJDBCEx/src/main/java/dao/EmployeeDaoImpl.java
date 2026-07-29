package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mapper.EmployeeRowMapper;
import model.Employee;

@Repository 

/*
 * Marks this class as a DAO component. Spring automatically creates a bean for
 * it (provided you've enabled component scanning).
 */

public class EmployeeDaoImpl implements IEmployeeDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Employee employee) {
		String sql= "Insert into Employee values(?,?,?,?,?)";
		
		return jdbcTemplate.update(sql,employee.getId(),
                employee.getName(),
                employee.getDepartment(),
                employee.getSalary(),
                employee.getCity());
	}

	@Override
	public Employee findById(int id) {
		 String sql ="SELECT * FROM employee WHERE id=?";
		            

		    return jdbcTemplate.queryForObject(
		            sql,
		            new EmployeeRowMapper(),
		            id);
	}

	@Override
	public List<Employee> findAll() {
		 String sql =
		            "SELECT * FROM employee";

		    return jdbcTemplate.query(
		            sql,
		            new EmployeeRowMapper());

	}

	@Override
	public int update(Employee employee) {
		String sql ="Update employee set salary=? where id=?" ;
		
		return jdbcTemplate.update(sql,employee.getSalary(),employee.getId());
	}

	@Override
	public int delete(int id) {
		String sql ="delete from employee where id=? " ;
		
		return jdbcTemplate.update(sql,id);
               
	}

	@Override
	public void batchInsert(List<Employee> employees) {
		String sql =
	            "INSERT INTO employee VALUES(?,?,?,?,?)";

	    jdbcTemplate.batchUpdate(
	            sql,
	            new BatchPreparedStatementSetter() {

	                @Override
	                public void setValues(
	                        PreparedStatement ps,
	                        int i)
	                        throws SQLException {

	                    Employee employee =
	                            employees.get(i);

	                    ps.setInt(1,
	                            employee.getId());

	                    ps.setString(2,
	                            employee.getName());

	                    ps.setString(3,
	                            employee.getDepartment());

	                    ps.setDouble(4,
	                            employee.getSalary());

	                    ps.setString(5,
	                            employee.getCity());

	                }

	                @Override
	                public int getBatchSize() {

	                    return employees.size();

	                }

	            });
		
	}

	@Override
	public void deductSalary(int fromId, double amount) {
		String sql = "UPDATE employee SET salary = salary - ? WHERE id = ?";

	    jdbcTemplate.update(sql, amount, fromId);
		
	}

	@Override
	public void addSalary(int toId, double amount) {
		 String sql ="UPDATE employee SET salary = salary + ? WHERE id = ?";
			        
	     jdbcTemplate.update(sql, amount, toId);
		
	}

}
