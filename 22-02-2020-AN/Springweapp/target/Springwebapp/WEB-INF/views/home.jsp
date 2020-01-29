<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello world</title>
<style>

input
{
float:right;
}
span
{
float:left;
}
#submit
{
}

</style>
</head>
<body>
<button><a href = "<c:url value = "/home"/>">Home</a></button>
<button><a href = "<c:url value = "/viewall"/>">View All</a></button>
<button><a href = "<c:url value = "/view"/>">View</a></button>
<button><a href = "<c:url value = "/edit"/>">Edit</a></button>

<button><a href = "<c:url value = "/delete"/>">Delete</a></button>

<div style="text-align: center;">
<form action="login" method="post">
 
  <span>Employee ID:</span>
  <input type="text" name="id">
  <br/><br/>
  <span>First name:</span>
  <input type="text" name="fname">
  <br/><br/>
  <span>Last name:</span>
  <input type="text" name="lname" >
  <br/><br/>
  <span>Phone:</span>
  <input type="tel" name="phone" >
  <br/><br/>
  <span>Email:</span>
  <input type="email" name="email" >
  <br/><br/>
  <input id="submit" type="submit" value="Submit">
</form> 
</div>
</body>
</html>