<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/16
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="refresh" content="1">
</head>
<body>
<%
    DateTimeFormatter formatter=
    DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh点mm分ss秒");
    String now = formatter.format(LocalDateTime.now());
%>
<h1><%=now %></h1>
</body>
</html>