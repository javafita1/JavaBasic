package sessionMgmt.HiddenFields;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");

        out.println("<h2>Welcome " + username + "</h2>");

        out.println("<form action='hhome' method='post'>");

        out.println("<input type='hidden' name='username' value='" + username + "'>");

        out.println("<input type='submit' value='Go to Home'>");

        out.println("</form>");
    }

}
