<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Successful</title>
    <link rel="stylesheet" type="text/css" href="path-to-your-css/style.css">
</head>
<body>
    <div class="container">
        <h1>Registration Successful</h1>
        <p>Thank you for registering, ${investor.firstName}!</p>
        <h2>Your Information:</h2>
        <p>Name: ${investor.firstName} ${investor.lastName}</p>
        <p>Address: ${investor.address}</p>
        <p>Contact: ${investor.contact}</p>
        <p>Age: ${investor.age}</p>

        <h2>Select a Product:</h2>
        <form action="/select-product" method="post">
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

