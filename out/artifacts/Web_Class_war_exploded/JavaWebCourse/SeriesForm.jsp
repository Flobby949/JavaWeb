<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/21
  Time: 8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数列表单</title>
</head>
<body>
<form action="series" method="post">
    等差数列求和：<br>
    首项：<input type="text" name="firstItem" size="5"><br>
    公差：<input type="text" name="var" size="5"><br>
    项数：<input type="text" name="num" size="5"><br>
    <input type="submit" value="提交（求和）">
</form>

<form action="series" method="get">
    等比数列求和：<br>
    首项：<input type="text" name="firstItem" size="5"><br>
    公比：<input type="text" name="var" size="5"><br>
    项数：<input type="text" name="num" size="5"><br>
    <input type="submit" value="提交（求和）">
</form>
</body>
</html>
