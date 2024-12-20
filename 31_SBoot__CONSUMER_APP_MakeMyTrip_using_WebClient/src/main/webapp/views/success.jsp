<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <title>Ticket Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        table {
            border-collapse: collapse;
            width: 50%;
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
    </style>
</head>
<body>
    <h2>Ticket Details</h2>
    <table>
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>Ticket ID</td>
            <td>${ticket.ticketId}</td>
        </tr>
        <tr>
            <td>From</td>
            <td>${ticket.ticketFrom}</td>
        </tr>
        <tr>
            <td>To</td>
            <td>${ticket.ticketTo}</td>
        </tr>
        <tr>
            <td>Train Number</td>
            <td>${ticket.trainNum}</td>
        </tr>
        <tr>
            <td>Ticket Cost</td>
            <td>${ticket.ticketCost}</td>
        </tr>
        <tr>
            <td>Ticket Status</td>
            <td>${ticket.ticketStatus}</td>
        </tr>
    </table>
    <a href="gobackToIndex">Go back</a>
</body>
</html>