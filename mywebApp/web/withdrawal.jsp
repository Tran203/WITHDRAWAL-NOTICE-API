<%@page import="com.enviro.assessment.grad001.AphaneInnocent.entities.Product"%>
<%
    Product product = (Product) session.getAttribute("product");
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Withdrawal Notice</title>
    <link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
    <div class="container">
        <h1>Withdrawal Notice</h1>
        <h2>Product Details:</h2>
        <p>Product Name: ${product.name}</p>
        <p>Product Type: ${product.type}</p>
        <p>Current Balance: ${product.balance}</p>

        <h2>Withdrawal Form:</h2>
        <form action="WithdrawalServlet.do" method="post">
            <input type="hidden" name="productId" value="${product.id}">
            
            <label for="withdrawalAmount">Withdrawal Amount:</label>
            <input type="text" id="withdrawalAmount" name="withdrawalAmount" required><br>

            <!-- Add any additional fields or validation here -->

            <input type="submit" value="Withdraw">
        </form>
    </div>
</body>
</html>
