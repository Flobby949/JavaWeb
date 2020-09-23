<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法表</title>
</head>
<body>
<%
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= i; j++) {
%>
<%=j%> * <%=i%> = <%= i * j %>;
<%
    }
%>
<br>
<%
    }
%>

<jsp:include page="ShowTime.jsp"/>
</body>
</html>
