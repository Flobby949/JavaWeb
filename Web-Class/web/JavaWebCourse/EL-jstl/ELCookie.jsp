<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/4
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookie隐式对象</title>
</head>
<body>
<br>
cookie对象的信息：</br>
${cookie.username}</br>
cookie对象的名称和值:</br>
${cookie.username.name} = ${cookie.username.value}
<%
    response.addCookie(new Cookie("username","Flobby"));
%>
</body>
</html>
