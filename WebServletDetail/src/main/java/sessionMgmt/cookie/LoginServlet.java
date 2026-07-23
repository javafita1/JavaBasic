package sessionMgmt.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");

        // Create Cookie
        Cookie cookie = new Cookie("user", username);

        // Cookie valid for 1 hour
        cookie.setMaxAge(60 * 60);

        response.addCookie(cookie);

        out.println("<h2>Welcome " + username + "</h2>");

        out.println("<a href='home'>Go to Home</a>");
    }

}
