<h2>Welcome</h2>

<%
String user = (String)session.getAttribute("user");
%>

Welcome <%= user %>

<a href='logout.jsp'>Logout</a>