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
    <title>people</title>
</head>
<body>
<jsp:useBean id="p" class="webclass.java.People"/>
<jsp:setProperty name="p" property="*"/>
姓名：<jsp:getProperty name="p" property="name"/>
年龄：<jsp:getProperty name="p" property="age"/>
是否男孩：<jsp:getProperty name="p" property="boy"/>

</body>
</html>