package sessionMgmt.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class HsLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    	
    	response.setContentType("text/html");

        String username = request.getParameter("username");

        // Create a new session (or return existing one)
        HttpSession session = request.getSession();

        // Store data in session
        session.setAttribute("user", username);

        PrintWriter out = response.getWriter();

        out.println("<h2>Login Successful</h2>");
        out.println("<a href='hshome'>Go to Home</a>");
    }
}