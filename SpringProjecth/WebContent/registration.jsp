<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="register.obj" modelAttribute="studentBean" >
<h3>Student Registration Portal</h3>
<h4>Enter your details below</h4>

First Name   : <sf:input path ="fname"></sf:input> 
<sf:errors path="fname"> </sf:errors> <br><br>   
 Last Name   : <sf:input path ="lname"></sf:input><
 <sf:errors path="lname"> </sf:errors> <br><br>
Age    : <sf:input path ="age"></sf:input>
<sf:errors path="age"> </sf:errors> <br><br>
Gender : <sf:radiobutton  path="gender" value="male"></sf:radiobutton> Male
         <sf:radiobutton  path="gender" value="female"></sf:radiobutton>Female
         
    <sf:errors path="gender"> </sf:errors> <br><br> 
Mob Number : <sf:input path ="mobno"></sf:input><br><br>
    
 City  : <sf:select path="city">
 <sf:option value="select city"></sf:option>
 <sf:option value="pune">Pune</sf:option>
 <sf:option value="mumbai">Mumbai</sf:option>
 <sf:option value="bengaluru">Bengluru</sf:option>
 <sf:option value="hyderabad">Hyderabad</sf:option>
 <sf:option value="chennai">Chennai</sf:option>
 </sf:select><br><br>
 <input type="submit" value ="submit">
 <input type="reset" value ="reset">
</sf:form>

</body>
</html>