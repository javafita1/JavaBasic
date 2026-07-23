import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		out.println("<h2>GET Method Called</h2>");
        out.println("Name : " + name + "<br>");
        out.println("Age : " + age);
		
	}
	
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		out.println("<h2>POST Method Called</h2>");
        out.println("Name : " + name + "<br>");
        out.println("Age : " + age);
		
	}

}
