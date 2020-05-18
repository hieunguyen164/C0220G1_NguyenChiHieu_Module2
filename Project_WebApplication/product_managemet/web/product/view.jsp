<%--
  Created by IntelliJ IDEA.
  User: HieuNguyen
  Date: 16-May-20
  Time: 10:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product detail</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name:</td>
        <td>${product.getName()}</td>
    </tr>
    tr>
    <td>Brand:</td>
    <td>${product.getBrand()}</td>
    </tr>
    tr>
    <td>Price:</td>
    <td>${product.getPrice()}</td>
    </tr>
</table>
</body>
</html>
