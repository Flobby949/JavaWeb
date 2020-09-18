<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/16
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    final int A = 7;
    for (int i = 0; i < A; i += 2) {
        for (int j = 0; j <= i; j++) {
%>
<%="*"%>
<%
    }
%>
<br>
<%
    }
%>

<%
    final int B = 5;
    for (int i = B; i <= B; i -= 2) {
        for (int j = 0; j < i; j++) {
%>
<%="*"%>
<%
    }
%>
<br>
<%
    }
%>
</body>
</html>
