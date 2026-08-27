import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{
	
	/*
	 * public DemoServlet() { System.out.println("A. Constructor called"); }
	 */
	 
	public void init() {
		 System.out.println("A. Servlet Initialized");
	}
	
	protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
		

		 System.out.println("A. doGet() called");
		 response.getWriter().println("Hello");
	        
	}
	
	public void destroy() {
		 System.out.println("A. Servlet destroyed");
	}
	

}
