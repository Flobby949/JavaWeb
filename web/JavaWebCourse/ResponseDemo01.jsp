<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %><%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response011111</title>
</head>
<body>
<%
    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh时mm分ss秒");
    String now = formatter.format(LocalDateTime.now());
    response.setHeader("refresh","5;URL=https://github.com/");
%>
<%=now%>
<br>
<br>
<!-- 客户端跳转 网址和页面一起变  只有jsp:forward是服务器跳转 -->
5s后跳转到github
</body>
</html>