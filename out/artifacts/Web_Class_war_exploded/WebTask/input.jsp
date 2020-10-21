<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/16
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>input</title>
</head>
<body>
<form action="sumOrProduct" method="post">
    用;分隔<br>
    <h3>post</h3>
    <input type="text" name="data"><br>
    <input type="submit" value="提交">
</form>
<h3>get</h3>
<form action="sumOrProduct" method="get">
    <input type="text" name="data"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
