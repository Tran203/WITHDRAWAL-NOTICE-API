<%-- 
    Document   : register_successful
    Created on : 31 Aug 2023, 8:06:09 PM
    Author     : Student
--%>

<%@page import="com.enviro.assessment.grad001.AphaneInnocent.entities.Investor"%>
<%
    Investor investor = (Investor) session.getAttribute("investor");
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Successful</title>
    <link rel="stylesheet" type="text/css" href="path-to-your-css/style.css">
</head>
<body>
    <div class="container">
        <h1>Registration Successful</h1>
        <p>Thank you for registering, <%=investor.getFirstName()%>!</p>
        <h2>Your Information:</h2>
        <p>Name:<%=investor.getFirstName()%> <%=investor.getLastName()%></p>
        <p>Address: <%=investor.getAddress()%></p>
        <p>Contact: <%=investor.getContact()%></p>
        <p>Age: <%=investor.getAge()%></p>

        <h2>Select a Product:</h2>
        <form action="ProductServlet.do" method="post">
            <input type="hidden" name="investorId" value="<%=investor.getId()%>">
            
            <label for="productType">Product Type:</label>
            <select id="productType" name="productType">
                <option value="RETIREMENT">Retirement</option>
                <option value="SAVINGS">Savings</option>
            </select><br>

            <label for="productName">Product Name:</label>
            <input type="text" id="productName" name="productName" required><br>

            <label for="initialBalance">Initial Balance:</label>
            <input type="number" id="initialBalance" name="initialBalance" required><br>

            <input type="submit" value="Select Product">
        </form>
    </div>
</body>
</html>

