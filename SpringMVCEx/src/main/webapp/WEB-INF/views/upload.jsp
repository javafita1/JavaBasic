<%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%>

<html>

<body>

<h2>Upload Resume</h2>

<form action="upload"

      method="post"

      enctype="multipart/form-data">

Employee Name

<input type="text"
       name="name">

<br><br>

Resume

<input type="file"
       name="resume">

<br><br>

<input type="submit"
       value="Upload">

</form>

</body>

</html>