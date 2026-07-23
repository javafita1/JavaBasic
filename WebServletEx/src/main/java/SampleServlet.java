import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.*;

//@WebServlet("/sample")
public class SampleServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		res.getWriter().println("Inside doGet method");
		
		 PrintWriter out = res.getWriter();
		   
		   ServletContext context = getServletContext();
		   
		   String college = context.getInitParameter("college");
	        String city = context.getInitParameter("city");

	        out.println("College : " + college);
	      
	        out.println("City : " + city);
	        
	        ServletConfig config = getServletConfig();

	        String teacher = config.getInitParameter("teacher");

	        out.println("Teacher Name : " + teacher);
	        
	        String count = config.getInitParameter("studentCount");

	        out.println("Student Count : " + count);
	    }
	
}
