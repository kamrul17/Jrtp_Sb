<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 20px;
        }
        form {
            max-width: 500px;
            margin: auto;
            background: #fff;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        label {
            font-weight: bold;
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"], input[type="number"], input[type="date"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h2>Passenger Booking Form</h2>
    <form action="submitPassenger" method="post">
        <label for="passengerId">Passenger ID:</label>
        <input type="number" id="passengerId" name="PassengerId" placeholder="Enter Passenger ID">

        <label for="fName">First Name:</label>
        <input type="text" id="fName" name="fName" placeholder="Enter First Name">

        <label for="lName">Last Name:</label>
        <input type="text" id="lName" name="lName" placeholder="Enter Last Name">

        <label for="from">From:</label>
        <input type="text" id="from" name="from" placeholder="Enter Departure Location">

        <label for="to">To:</label>
        <input type="text" id="to" name="to" placeholder="Enter Destination">

        <label for="trainNum">Train Number:</label>
        <input type="text" id="trainNum" name="trainNum" placeholder="Enter Train Number">

        <label for="doj">Date of Journey:</label>
        <input type="date" id="doj" name="doj">

        <button type="submit">Submit</button>
    </form>
    <a href="search">Search ticket</a>
    <a href="findAllTicket">find all</a>
</body>
</html>