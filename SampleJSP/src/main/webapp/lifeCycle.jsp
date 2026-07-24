<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!
public void jspInit() {
    System.out.println("JSP Initialized");
}

public void jspDestroy() {
    System.out.println("JSP Destroyed");
}
%>
<!DOCTYPE html>
<html>
<head>
<title>JSP Lifecycle1</title>
</head>
<body>

<h2>JSP Lifecycle Demo</h2>

<%
out.println("Current Time: " + new java.util.Date());
%><br><br>

sum:
<%=10+20 %><br><br>



<%! 
int sum=0;

int add(int a,int b){
	return a+b;
}
%>

<%=add(3,4) %>

</body>
</html>