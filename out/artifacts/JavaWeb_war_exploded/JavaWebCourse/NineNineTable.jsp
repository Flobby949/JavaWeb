<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/16
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 align="center">九九乘法表</h1>

<% for (int i = 1; i <= 9; i++) { %>

<% for (int j = 1; j <= i; j++) { %>

<%=i%>*<%=j%>=<%=i * j%> &nbsp;&nbsp;

<%}%>

<br>

<%}%>

<%@include file="TimeTest.jsp"%>
<jsp:include page="TimeTest.jsp"></jsp:include>

</body>
</html>