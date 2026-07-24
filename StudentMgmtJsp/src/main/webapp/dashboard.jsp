<%@ page import="java.util.ArrayList" errorPage="error.jsp" %>

<%@ taglib uri="jakarta.tags.core"
prefix="c"%>

<%@ include file="header.jsp"%>

<%

String user=(String)session.getAttribute("username");

if(user==null)
{

response.sendRedirect("login.jsp");

}

%>

<h2>

Welcome

<%=user%>

</h2>

<a href="logout.jsp">

Logout

</a>

<br><br>

<%

ArrayList<String> subjects=new ArrayList<>();

subjects.add("Java");

subjects.add("JSP");

subjects.add("Servlet");

request.setAttribute("subjects",subjects);

%>

Subjects

<ul>

<c:forEach items="${subjects}"
var="sub">

<li>

${sub}

</li>

</c:forEach>

</ul>

<%@ include file="footer.jsp"%>