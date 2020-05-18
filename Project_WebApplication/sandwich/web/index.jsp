<%--
  Created by IntelliJ IDEA.
  User: HieuNguyen
  Date: 18-May-20
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sandwich Condiment</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/result" method="post">
  <table>
    <tr>
      <td><input type="checkbox" name="condiment" value="lettuce">Lettuce</td>
      <td><input type="checkbox" name="condiment" value="tomato">Tomato</td>
      <td><input type="checkbox" name="condiment" value="mustard">Mustard</td>
      <td><input type="checkbox" name="condiment" value="sprouts">Sprouts</td>
    </tr>
    <tr>
      <td><input type="submit" value="Save"></td>
    </tr>
  </table>
</form>
</body>
</html>
