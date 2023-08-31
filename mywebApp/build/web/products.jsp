<%@page import="com.enviro.assessment.grad001.AphaneInnocent.entities.Investor"%>
<%
    Investor investor = (Investor) request.getAttribute("investor");
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Selection Successful</title>
    <link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
    <div class="container">
        <h1>Product Selection Successful</h1>
        <p>Thank you for selecting a product, <%=investor.getFirstName()%>!</p>

        <h2>Your Investments:</h2>
        <table>
            <tr>
                <th>ID</th>
                <th>Type</th>
                <th>Name</th>
                <th>Balance</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${investor.products}" var="product">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.type}</td>
                    <td>${product.name}</td>
                    <td>${product.balance}</td>
                    <td>
                        <form action="WithdrawalServlet.do" method="post">
                            <input type="hidden" name="productId" value="${product.id}">
                            <input type="submit" value="Withdraw">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>

