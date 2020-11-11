<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/6
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>投票</title>
</head>
<body>
<form action="vote" method="get">
    <input type="radio" name="item" value="one" checked>一号<br>
    <input type="radio" name="item" value="two">二号<br>
    <input type="radio" name="item" value="three">三号<br>
    <input type="radio" name="item" value="four">四号<br>
    <input type="radio" name="item" value="five">五号<br>
    <input type="submit" value="投票">
</form>
</body>
</html>