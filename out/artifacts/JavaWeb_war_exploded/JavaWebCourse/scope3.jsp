<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scope33333</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    /* 获取page属性范围的数据值*/
    String name = (String) application.getAttribute("name");
    Integer age=(Integer) application.getAttribute("age");
%>
<h2>姓名：<%=name%></h2>
<h2>年龄：<%=age%></h2>
</body>
</html>
