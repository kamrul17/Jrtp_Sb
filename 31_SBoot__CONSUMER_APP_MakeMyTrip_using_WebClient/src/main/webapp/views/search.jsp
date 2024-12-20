<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <style>
        body {
            font-family: Arial, sans-serif;
        }
        .search-container {
            margin: 50px;
            text-align: center;
        }
        input[type="text"] {
            width: 300px;
            padding: 10px;
            font-size: 16px;
        }
        input[type="submit"] {
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="search-container">
        <h2>Search for Items</h2>
        <form action="searchResult">
            <input type="text" name="ticketId" placeholder="Enter search term" required />
            <input type="submit" value="Search" />
        </form>
    </div>
</body>
</html>