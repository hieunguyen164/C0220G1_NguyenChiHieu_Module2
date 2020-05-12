<%--
  Created by IntelliJ IDEA.
  User: HieuNguyen
  Date: 11-May-20
  Time: 12:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Danh sach khach hang</title>
  </head>
  <body>
  <form method="post" action="/customer">
  <table>
    <tr>
    <h2>Danh sach khach hang</h2>
    </tr>
    <tr>
      <th><h2>Ten</h2></th>
      <th><h2>Ngay sinh</h2></th>
      <th><h2>Dia chi</h2></th>
      <th><h2>Anh</h2></th>
      <th><input type="submit"></th>
    </tr>
      <c:forEach var="customer" items="${customers}">
    <tr>
      <td><c:out value="${customer.getName()}"></c:out></td>
      <td><c:out value="${customer.getBirthday()}"></c:out></td>
      <td><c:out value="${customer.getAddress()}"></c:out></td>
      <td><c:out value="${customer.getImage()}"></c:out></td>
    </tr>
      </c:forEach>
  </table>
  </form>
  </body>
</html>
