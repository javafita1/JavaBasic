package sessionMgmt.HttpSession;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class HsLogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if(session != null) {
            session.invalidate();
        }

        response.getWriter().println("Logged Out Successfully");
    }
}
