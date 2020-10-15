<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/7
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="p" class="webclass.java.Student"/>
<jsp:setProperty name="p" property="*"/>
姓名：${p.name}<br>
年龄：${p.age}<br>
</body>
</html>
