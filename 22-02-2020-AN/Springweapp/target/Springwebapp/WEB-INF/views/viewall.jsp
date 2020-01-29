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

<table>
<button><a href = "<c:url value = "/home"/>">Back</a></button>

<c:forEach items = "${employee}" var="employee">
<tr>      
        <td><c:out value = "${employee.id}"/></td>
        <td><c:out value = "${employee.fname }"/></td>
        <td><c:out value = "${employee.lname }"/></td>
        <td><c:out value = "${employee.email }"/></td>
        <td><c:out value = "${employee.phone }"/></td>  
    </tr>      
  </c:forEach>

</table>
</body>
</html>