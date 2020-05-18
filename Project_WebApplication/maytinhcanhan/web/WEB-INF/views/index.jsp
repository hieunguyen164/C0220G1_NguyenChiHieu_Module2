<%--
  Created by IntelliJ IDEA.
  User: HieuNguyen
  Date: 18-May-20
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<form action="/calculate" method="post">
    <h1>Calculator</h1>
    <input type="text" name="number1" value="${num1}" >
    <input type="text" name="number2" value="${num2}"></br></br>
    <input type="submit" name="operand" value="Addition(+)" >
    <input type="submit" name="operand" value="Subtraction(-)">
    <input type="submit" name="operand" value="Multiplication(*)">
    <input type="submit" name="operand" value="Division(/)">
    <h1>${result}</h1>


</form>
</body>
</html>

