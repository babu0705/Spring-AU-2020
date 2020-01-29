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
float:left;
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
<body style="background-color: 	#e9d2fe	;">

<div style="background-color: olive; margin-top: 0;margin-bottom: 10;padding-top: 0;top: 0;">
<button><a href = "<c:url value = "/home"/>">Home</a></button>
<button><a href = "<c:url value = "/viewall"/>">View All</a></button>
<button><a href = "<c:url value = "/view"/>">View By ID</a></button>
<button><a href = "<c:url value = "/edit"/>">Update</a></button>
<button><a href = "<c:url value = "/delete"/>">Delete</a></button>
</div>
<div style="text-align: center;">
<form action="login" method="post">
<br><br>
 
  <span>Employee ID &nbsp;:&nbsp;&nbsp;</span>
  <input type="text" name="id"> 
  <br/><br/>
  <span>First name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;</span>
  <input type="text" name="fname">
  <br/><br/>
  <span>Last name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;</span>
  <input type="text" name="lname" >
  <br/><br/>
  <span>Phone&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;</span>
  <input type="tel" name="phone" >
  <br/><br/>
  <span>Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</span>
  <input type="email" name="email" >
  <br/><br/>
  <input id="submit" type="submit" value="Submit">
</form> 
</div>
</body>
</html>