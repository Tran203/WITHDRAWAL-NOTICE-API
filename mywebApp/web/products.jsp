<%@page import="java.util.List"%>
<%@page import="com.enviro.assessment.grad001.AphaneInnocent.entities.Product"%>
<%@page import="com.enviro.assessment.grad001.AphaneInnocent.entities.Investor"%>
<%
    Investor investor = (Investor) request.getAttribute("investor");
    List<Product> listProduct = (List<Product>) request.getAttribute("listProduct");
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

                <% for (Product product : listProduct) {%>
                <tr>
                    <td><%=product.getId()%></td>
                    <td><%=product.getType()%></td>
                    <td><%=product.getName()%></td>
                    <td><%=product.getBalance()%></td>
                    <td>
                        <form action="WithdrawalServlet.do" method="get">
                            <input type="hidden" name="productId" value="<%=product.getId()%>">
                            <input type="submit" value="Withdraw">
                        </form>
                    </td>
                </tr>
                <% }%>
            </table>
        </div>
    </body>
</html>

