<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/10
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生</title>
</head>
<body>
<jsp:useBean id="p" class="webclass.beans.StudentsWork"/>
<jsp:setProperty name="p" property="id"/>
<jsp:setProperty name="p" property="name" value = "啦啦啦啦" />
<jsp:setProperty name="p" property="age" value = "25"/>
学号：<jsp:getProperty name="p" property="id" />
姓名：<jsp:getProperty name="p" property="name"/>
年龄：<jsp:getProperty name="p" property="age"/>
</body>
</html>
