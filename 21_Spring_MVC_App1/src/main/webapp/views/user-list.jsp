<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>All Users</title>
</head>
<body>
    <h1>All Users</h1>
    <table border="1">
        <thead>
            <tr>
              
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
            </tr>
        </thead>
        <tbody>
            <!-- Loop through the users list -->
            <c:forEach var="user" items="${userList}">
                <tr>
                
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.phoneNo}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
