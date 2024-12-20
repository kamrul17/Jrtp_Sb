<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        table {
            border-collapse: collapse;
            width: 80%;
            margin: auto;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f4f4f4;
        }
        h2 {
            text-align: center;
        }
        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
    <h2>Ticket List</h2>
    <table>
        <thead>
            <tr>
                <th>Ticket ID</th>
                <th>From</th>
                <th>To</th>
                <th>Train Number</th>
                <th>Ticket Cost</th>
                <th>Ticket Status</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="ticket" items="${tickets}">
                <tr>
                    <td>${ticket.ticketId}</td>
                    <td>${ticket.ticketFrom}</td>
                    <td>${ticket.ticketTo}</td>
                    <td>${ticket.trainNum}</td>
                    <td>${ticket.ticketCost}</td>
                    <td>${ticket.ticketStatus}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="gobackToIndex">Go back</a>
</body>
</html>