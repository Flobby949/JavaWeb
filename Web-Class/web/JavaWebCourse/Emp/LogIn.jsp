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
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
</head>
<body>

<form action="empServlet?action=login" method="post">
    <br>
    &nbsp;&nbsp;用户名:&nbsp;&nbsp;<input type="text" name="username"><br><br>
    &nbsp;&nbsp;密码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password"><br><br>
    验证码：<input type="text" name="verifyCode">
    <img name="verifyCode" src="/verifyCode" onclick="this.src = this.src + '?'">
    <a href="javascript:document.verifyCode.onclick();">换一张</a>
    <br><br>
    &nbsp;&nbsp;<input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;<a href="Register.jsp">注册</a>
</form>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>

</body>
</html>