<%-- 
    Document   : populate
    Created on : 31 Aug 2023, 7:51:38 PM
    Author     : Student
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Investor</title>
    <link rel="stylesheet" type="text/css" href="path-to-your-css/style.css">
</head>
<body>
    <div class="container">
        <h1>Register Investor</h1>
        <form action="InvestorServlet.do" method="post">
            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" required><br>

            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" required><br>

            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required><br>

            <label for="contact">Contact:</label>
            <input type="text" id="contact" name="contact" required><br>

            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required><br>

            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>
