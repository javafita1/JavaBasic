package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Employee employee = new Employee();

	        employee.setId(rs.getInt("id"));
	        employee.setName(rs.getString("name"));
	        employee.setDepartment(rs.getString("department"));
	        employee.setSalary(rs.getDouble("salary"));
	        employee.setCity(rs.getString("city"));
	        
	        return employee;

	}

}
