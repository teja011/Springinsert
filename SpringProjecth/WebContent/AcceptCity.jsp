<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<form action="getStudentList.obj">
Select City Name :
<select name="city">
<c:forEach items="${cityList}" var="city">
<option value="${city }">${city}</option>
</c:forEach>
</select>
<br>
<input type="submit" value="Get Student List">
</form>

<table>
<c:forEach items="${studentList}" var="student">
<tr><td>${student.fname }<td>${student.lname}
<td>${student.age}<td>${student.city }

</c:forEach>
</table>

</body>
</html>