<%@ include file="header.jsp"%>

<form
action="saveStudent.jsp" method="post">

ID

<input type="number"
name="id">

<br><br>

Name

<input type="text"
name="name">

<br><br>

Department

<input type="text"
name="dept">

<br><br>

Marks

<input type="number"
step="0.01"
name="marks">

<br><br>

<input
type="submit" value="Save">

</form>

<%@ include file="footer.jsp"%>