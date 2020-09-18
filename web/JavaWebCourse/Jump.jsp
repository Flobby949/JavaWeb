<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/18
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--设置字符编码集-->
<%
    request.setCharacterEncoding("utf-8");
%>
<h2>服务器跳转指令</h2>
<jsp:forward page="ParamDemo.jsp">
    <jsp:param name="name" value="aaaa"/>
    <jsp:param name="age" value="222"/>
</jsp:forward>
</body>
</html>
