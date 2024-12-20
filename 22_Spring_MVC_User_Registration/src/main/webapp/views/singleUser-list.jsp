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
              <th>S.Id</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Course</th>
                  <th>Timings</th>
            </tr>
        </thead>
        <tbody>
    
                <tr>
                <td>${user.sId}</td>
                    <td>${user.sName}</td>
                    <td>${user.sGender}</td>
                    <td>${user.course}</td>
                  
                       <!-- Loop through the timings list for each user -->
                            <td>
                        <ul>
                            <c:forEach var="time" items="${user.timings}">
                                <li>${time}</li>
                            </c:forEach>
                        </ul>
                    </td>
                </tr>
           
        </tbody>
    </table>
</body>
</html>
