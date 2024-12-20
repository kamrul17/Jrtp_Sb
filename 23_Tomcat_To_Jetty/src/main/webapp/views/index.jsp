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
    background-color: #f9f9f9;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

form {
    background-color: #ffffff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    width: 100%;
    max-width: 400px;
}

h2 {
    text-align: center;
    margin-bottom: 20px;
    color: #333333;
}

label {
    display: block;
    font-weight: bold;
    margin-top: 15px;
    margin-bottom: 5px;
    color: #555555;
}

input[type="text"],
select {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #cccccc;
    border-radius: 4px;
    box-sizing: border-box;
    font-size: 14px;
}

input[type="radio"],
input[type="checkbox"] {
    margin-right: 8px;
}

button {
    width: 100%;
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 4px;
    font-size: 16px;
    cursor: pointer;
}

button:hover {
    background-color: #45a049;
}

form label[for="gender"],
form label[for="timing"] {
    margin-top: 10px;
}

form input[type="radio"] + label,
form input[type="checkbox"] + label {
    margin-bottom: 5px;
}

form input[type="radio"] + label,
form input[type="checkbox"] + label {
    font-weight: normal;
    color: #333;
}

form br {
    margin-bottom: 10px;
}
.success-message {
    color: green;
    font-weight: bold;
    text-align: center;
    margin-top: 20px;
}
    </style>
</head>
<body>
<div>
 <h2>User Information Form</h2>
    <form action="submitForm" method="post"> 
        <label for="name">Name</label>
        <input type="text" id="name" name="sName" placeholder="Enter your name" required>

        <label for="gender">Gender:</label><br>
        
        <input type="radio" id="male" name="sGender" value="male" required>
        <label for="male">Male</label><br>
        
        <input type="radio" id="female" name="sGender" value="female">
        <label for="female">Female</label><br>
        
     <label for="course">Select a Course:</label><br>
        
        <select id="course" name="course" required>
            <option value="" disabled selected>Select your course</option>
            <option value="computer_science">Computer Science</option>
            <option value="mechanical_engineering">Mechanical Engineering</option>
            <option value="civil_engineering">Civil Engineering</option>
            <option value="electronics">Electronics</option>
            <option value="management">Management</option>
        </select><br><br>
        
          <label for="timing">Select Preferred Timing:</label><br>
        
        <input type="checkbox" id="morning" name="timings" value="morning">
        <label for="morning">Morning (8:00 AM - 12:00 PM)</label><br>
        
        <input type="checkbox" id="afternoon" name="timings" value="afternoon">
        <label for="afternoon">Afternoon (12:00 PM - 4:00 PM)</label><br>
        
        <input type="checkbox" id="evening" name="timings" value="evening">
        <label for="evening">Evening (4:00 PM - 8:00 PM)</label><br>
        
        <input type="checkbox" id="night" name="timings" value="night">
        <label for="night">Night (8:00 PM - 12:00 AM)</label><br><br>
        <button type="submit">Submit</button>
    </form>
   <div class="success-message">${msg}</div>
</div>
 
   
</body>
</html>