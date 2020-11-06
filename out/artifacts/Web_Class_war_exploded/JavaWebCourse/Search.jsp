<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/4
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>调查问卷</title>
</head>
<body>
<form action="SearchResult.jsp" method="get">
    name:<input type="text" name="name"><br>
    hobby:
    <input type="checkbox" name="hobby" value="sing">唱歌
    <input type="checkbox" name="hobby" value="dance">跳舞
    <input type="checkbox" name="hobby" value="basketball">篮球
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
