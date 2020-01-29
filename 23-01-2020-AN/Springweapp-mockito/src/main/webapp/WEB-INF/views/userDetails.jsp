<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello world</title>
</head>

<body>

<button><a href="<c:url value='/home'/>">Back</a></button>
<h2>${employee.fname }</h2>
<h2>${employee.lname }</h2>
<h2>${employee.id }</h2>
<h2>${employee.email }</h2>
<h2>${employee.phone }</h2>

</body>
</html>
