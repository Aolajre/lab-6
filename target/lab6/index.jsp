<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Flight Booking</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
        }

        h1 {
            color: #333;
        }

        h2 {
            color: #555;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
            display: inline-block;
        }

        label {
            font-size: 18px;
            color: #444;
        }

        input[type="radio"] {
            margin-right: 10px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        p {
            font-size: 20px;
            color: #009900;
            margin-top: 20px;
        }

        .logo {
            max-width: 150px; /* Adjust the width as needed */
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <img src="logo.png" alt="Logo" class="logo"> <!-- Replace "logo.png" with your logo file -->

    <h1>Flight Booking System</h1>

    <!-- Display booking results -->
    <% 
    String bookingResult = (String) request.getAttribute("bookingResult");
    if (bookingResult != null) {
    %>
    <p><%= bookingResult %></p>
    <% } %>

    <!-- Seat selection form -->
    <form action="lab" method="post">
        <h2>Select Your Seat Class</h2>
        <label for="firstClass">First Class</label>
        <input type="radio" name="seatChoice" id="firstClass" value="firstClass">
        <br>
        <label for="economyClass">Economy Class</label>
        <input type="radio" name="seatChoice" id="economyClass" value="economyClass">
        <br>
        <input type="submit" value="Book Seat">
    </form>
</body>
</html>

