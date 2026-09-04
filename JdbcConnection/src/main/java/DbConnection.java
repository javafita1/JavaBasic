import java.sql.*;

public class DbConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			    
		Statement stmt= connection.createStatement();   
		
		ResultSet rs= stmt.executeQuery("Select * from student");

		while(rs.next()) {
			
			int id= rs.getInt("id");
			
			String name= rs.getString("name");
			
			String dept= rs.getString("department");
			
			System.out.println(id +" : "+ name +" : "+ dept);
		}
		
		rs.close();
		connection.close();
		stmt.close();
		
	}

}
