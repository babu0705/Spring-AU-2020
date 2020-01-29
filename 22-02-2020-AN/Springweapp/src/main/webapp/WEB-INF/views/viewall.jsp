<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style ="background-color: cyan">

<button><a href = "<c:url value = "/home"/>">Back</a></button>

<table border="1" align="center" style="background-color: white; ;border-color: black; border-collapse: collapse;box-shadow: silver;">
<tr style="background-color: silver;">
                    <th>Employee Id</th>
                    <th>Employee First_Name</th>
                    <th>Employee Last_Name</th>
                     <th>Employee Email</th>
                    <th>Employee Phone</th>
 </tr>
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