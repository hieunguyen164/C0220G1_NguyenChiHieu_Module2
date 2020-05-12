<%--
  Created by IntelliJ IDEA.
  User: HieuNguyen
  Date: 10-May-20
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form method="post" action="/display-discount">
    <label>Product Description: </label><br/>
    <input type="text" name="product"><br/><br/>
    <label>List Price:</label><br/>
    <input type="text" name="price" placeholder="0" value="0"><br/><br/>
    <label>Discount Percent:</label><br/>
    <input type="text" name="discount" placeholder="%" value="0"><br/><br/>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
