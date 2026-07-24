<jsp:useBean
id="student"
class="bean.Student"/>

<jsp:setProperty
name="student"
property="*"/>

<%@ include file="header.jsp"%>

<h2>

Student Details

</h2>

ID :

<jsp:getProperty
name="student"
property="id"/>

<br>

Name :

<jsp:getProperty
name="student"
property="name"/>

<br>

Department :

<jsp:getProperty
name="student"
property="dept"/>

<br>

Marks :

<jsp:getProperty
name="student"
property="marks"/>

<%@ include file="footer.jsp"%>