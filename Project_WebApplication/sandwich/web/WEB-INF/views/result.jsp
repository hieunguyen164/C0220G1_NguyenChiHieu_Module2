<%--
  Created by IntelliJ IDEA.
  User: HieuNguyen
  Date: 18-May-20
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SANDWICH</title>
</head>
<body>
<c:forEach var="con" items="${condiment}">
    <tabe>
        <tr>
            <td><h1>${con}</h1></td>
        </tr>
    </tabe>

</c:forEach>
</body>
</html>
