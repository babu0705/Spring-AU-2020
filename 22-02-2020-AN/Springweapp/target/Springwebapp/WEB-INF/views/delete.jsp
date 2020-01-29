<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
<button><a href = "<c:url value = "/home"/>">Back</a></button>

<div style="text-align: center;">
<form action="deletedata" method="post">
 
  <span>Enter Employee ID:</span>
  <input type="text" name="id" >
  <br/><br/>
  <input id="submit" type="submit" value="Submit">
</form> <br/>

<span>${result}</span>

</div>
</body>
</html>