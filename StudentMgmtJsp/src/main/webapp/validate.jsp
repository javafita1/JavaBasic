<%

String user=request.getParameter("username");

String pass=request.getParameter("password");

if(user.equals("admin")
&& pass.equals("1234"))
{

session.setAttribute("username",user);

response.sendRedirect("dashboard.jsp");

}
else
{

response.sendRedirect("login.jsp");

}

%>