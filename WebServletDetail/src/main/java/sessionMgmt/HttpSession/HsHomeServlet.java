package sessionMgmt.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class HsHomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

    	response.setContentType("text/html");

        HttpSession session = request.getSession(false);

        PrintWriter out = response.getWriter();

        if(session != null) {

            String user = (String) session.getAttribute("user");

            if(user != null) {
                out.println("<h2>Welcome " + user + "</h2>");
                out.println("<a href='hslogout'>Logout</a>");
            }
            else {
                out.println("Session Expired");
            }

        } else {
            out.println("No Active Session");
        }
    }
}
