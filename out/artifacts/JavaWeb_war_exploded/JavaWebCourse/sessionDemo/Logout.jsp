<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注销</title>
</head>
<body>
<%
    session.invalidate();
    response.sendRedirect("Login.jsp");
%>
<h2>如果没有发生跳转，请点击 <a href="Login.jsp">这里</a> </h2>
</body>
</html>