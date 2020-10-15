<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/7
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student</title>
</head>
<body>
<jsp:useBean id="p" class="webclass.java.Student"/>
<jsp:setProperty name="p" property="*"/>
学号：<jsp:getProperty name="p" property="id"/>
姓名：<jsp:getProperty name="p" property="name"/>
年龄：<jsp:getProperty name="p" property="age"/>
</body>
</html>