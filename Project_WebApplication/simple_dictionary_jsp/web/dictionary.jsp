<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: HieuNguyen
  Date: 10-May-20
  Time: 10:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>
<%
    dic.put("hello","xin chao");
    dic.put("how","the nao");
    dic.put("book","quyen sach");
    dic.put("computer","may vi tinh");

    String search = request.getParameter("txtSearch");
    String result = dic.get(search);
    if(result != null){
        out.print("Word: "+search);
        out.print("Result: "+result);
    }else{
        out.print("Not found");
    }
%>
</body>
</html>
