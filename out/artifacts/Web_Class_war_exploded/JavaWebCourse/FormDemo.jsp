<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/18
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>表单传参</h2>
<form action="ParamDemo.jsp" method="post">
    姓名: <input type="text" name="name">
    <br>
    年龄: <input type="text" name="age">
    <br>
    <input type="submit" name="submit">
</form>
</body>
</html>
