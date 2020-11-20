<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/20
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="empServlet?action=login" method="post">
    用户名:&nbsp;&nbsp;<input type="text" name="username"><br>
    密码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password"><br>
    <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="Register.jsp">注册</a>
</form>
</body>
</html>
