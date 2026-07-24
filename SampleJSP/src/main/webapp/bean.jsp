<jsp:useBean id="student"
class="bean.Student"/>

<%
student.setName("Selva");
student.setId(1);
%>

<%= student.getName() %>
<%= student.getId() %>

<jsp:setProperty
name="student"
property="id"
value="101"/><br><br>

<jsp:setProperty
name="student"
property="name"
value="John"/>

ID :
<jsp:getProperty
name="student"
property="id"/>

<br>

Name :
<jsp:getProperty
name="student"
property="name"/>

