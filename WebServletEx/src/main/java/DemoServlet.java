import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.*;

public class DemoServlet extends HttpServlet
{

	
	public void init() {
		 System.out.println("Servlet Initialized");
	}
	
	protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
		

		 PrintWriter out = response.getWriter();
		   
		   ServletContext context = getServletContext();
		   
		   String college = context.getInitParameter("college");
	        String city = context.getInitParameter("city");

	        response.getWriter().println("College : " + college);
	      
	        out.println("City : " + city);
	        
	        ServletConfig config = getServletConfig();

	        String teacher = config.getInitParameter("teacher");

	        out.println("Teacher Name : " + teacher);
	        
	        String count = config.getInitParameter("studentCount");

	        out.println("Student Count : " + count);
	        
	}
	
	
	public void destroy() {
		 System.out.println("Servlet destroyed");
	}
	
}
