<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/10
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>运算</title>
</head>
<body>
<form action="CalculationResult.jsp" method="post">
    数字1：<input type="text" name="numberOne">
    <br>
    数字2：<input type="text" name="numberTwo">
    <br>
<select name="cal" size="1" style="width: 50px">
    <option value="1">加</option>
    <option value="2">减</option>
    <option value="3">乘</option>
    <option value="4">除</option>
</select>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" name="submit" value="提交">
</form>
</body>
</html>
