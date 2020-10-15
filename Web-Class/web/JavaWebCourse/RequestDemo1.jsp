<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request获取参数</title>
</head>
<body>

<form action="RequestDemo02.jsp" method="post">

    <!-- <form action="RequestDemo03.jsp" method="post"> -->

    姓名:<input type="text" name="name"><br>
    爱好:<input type="checkbox" name="inst" value="swimming">swimming
    <input type="checkbox" name="inst" value="reading">reading
    <input type="checkbox" name="inst" value="jogging">jogging
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>