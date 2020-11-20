<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/20
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="empServlet?action=register" method="post">
    请选择头像:<input type="file" name="head"><br><br>
    请输入用户名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="username"><br>
    请输入密码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="pw1"><br>
    请再次输入密码:&nbsp;&nbsp;<input type="password" name="pw1"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
