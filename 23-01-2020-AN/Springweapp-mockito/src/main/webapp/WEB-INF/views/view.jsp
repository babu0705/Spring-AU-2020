<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View by id</title>
</head>

<body style ="background-color: cyan">
<button><a href = "<c:url value = "/home"/>">Back</a></button>
<form action="viewdata" method="post">
 
  <span>Enter Employee ID:</span>
  <input type="text" name="id" >
  <input id="submit" type="submit" value="View">
</form> <br/>

<span>Employee Name: </span><span>${employee.fname }</span> <span>${employee.lname }</span>
<br>
<span>Employee ID: </span><span>${employee.id }</span> <br>
<span>Employee Email: </span><span>${employee.email }</span><br>
<span>Employee Phone: </span><span>${employee.phone }</span>
</body>
</html>
