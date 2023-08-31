<%-- 
    Document   : investor
    Created on : 31 Aug 2023, 3:34:18 PM
    Author     : Student
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Investor Information</title>
    <link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
    <div class="container">
        <h1>Investor Information</h1>
        <div class="investor-info">
            <p>Name: ${investor.firstName} ${investor.lastName}</p>
            <p>Address: ${investor.address}</p>
            <p>Contact: ${investor.contact}</p>
            <p>Age: ${investor.age}</p>
        </div>
    </div>
</body>
</html>
