<%
String username = request.getParameter("username");

// Store in session
session.setAttribute("user", username);
%>

<h2>Login Successful</h2>

<a href="home.jsp">Go to Home</a>