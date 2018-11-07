<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"
     prefix="sf" %>
     <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter the book details to enter book into record</h2>
<sf:form action="viewbook.obj" modelAttribute="bookBean">

Enter the name of the book : <sf:input  path="bookname"></sf:input><br><br>
Enter the author name : <sf:input path="bookauthor"></sf:input><br><br>
Enter the publishing year :<sf:input path="bookdate"></sf:input><br><br>
Enter the Price of the book : <sf:input path="bookprice"></sf:input><br><br>

<input type="submit" value="Submit">
</sf:form>
</body>
</html>