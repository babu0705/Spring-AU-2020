<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button><a href = "<c:url value = "/home"/>">Back</a></button>

<div style="text-align: center;">
<form action="fetch" method="post">
 
  <span>Enter Employee ID:</span>
  <input type="text" name="id" >
  <br/><br/>
  <input id="submit" type="submit" value="Fetch">
</form> <br/>

<span>Edit Form</span>
<form action="editdata" method="post">
 
  <span>Employee ID:</span>
  <input type="text" name="id"   value=${employee.id } >
  <br/><br/>
  <span>First name:</span>
  <input type="text" name="fname" value=${employee.fname } >
  <br/><br/>
  <span>Last name:</span>
  <input type="text" name="lname" value=${employee.lname }>
  <br/><br/>
  <span>Phone:</span>
  <input type="tel" name="phone" value=${employee.phone }>
  <br/><br/>
  <span>Email:</span>
  <input type="email" name="email" value=${employee.email }>
  <br/><br/>
  <input id="submit" type="submit" value="Submit">
</form> 
</div>
<span>${result}</span>

</body>
</html>