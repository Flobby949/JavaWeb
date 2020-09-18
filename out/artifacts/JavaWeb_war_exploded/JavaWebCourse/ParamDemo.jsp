<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/18
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--设置字符编码集-->
<%
    request.setCharacterEncoding("utf-8");
%>

<h1></h1>
<h1>姓名：<%=request.getParameter("name") %></h1>
<h2>年龄：<%=request.getParameter("age") %></h2>
</body>
</html>
