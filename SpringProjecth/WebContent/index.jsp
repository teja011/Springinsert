<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Demo</title>
</head>
<body>

<table border="1">
<c:forEach items="${studentList}" var="student">
<tr><Td>${student.fname } <td>${student.lname }
<td>${student.age }<td>${student.city }
<%-- <td><a href="updateStudent.obj?id=${student.studentId}">Update</a>
<td><a href="deleteStudent.obj?id=${student.studentId}">Delete </a> --%>
</c:forEach>
</table>

<h1>Welcome to the world of spring</h1>
<a href="displayDate.obj">Click here for home page</a><br><br>
<a href="showLoginPage.obj">Click here to Login</a><br><br>
<a href="registeruser.obj">click here to register Yourself</a><br><br>
<a href="studentcity.obj">Click here to get details of student city wise.</a>

</body>
</html>