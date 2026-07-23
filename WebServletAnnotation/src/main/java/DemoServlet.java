import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet{
	
	 public DemoServlet() {
	        System.out.println("B. Constructor called");
	    }
	 
	public void init() {
		 System.out.println("B. Servlet Initialized");
	}
	
	protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
		

		 System.out.println("B. doGet() called");
		 response.getWriter().println("Hello");
	        
	}
	
	public void destroy() {
		 System.out.println("B. Servlet destroyed");
	}
	

}
