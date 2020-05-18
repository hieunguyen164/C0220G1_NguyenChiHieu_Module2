<%--
  Created by IntelliJ IDEA.
  User: HieuNguyen
  Date: 18-May-20
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<p>
    <c:if test="${'message'!=null}">
        <span>${message}</span>
    </c:if>
</p>
<p>
    <span>${result}</span>
</p>

</body>
</html>
