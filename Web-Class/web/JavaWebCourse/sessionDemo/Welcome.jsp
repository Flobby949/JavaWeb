<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎</title>
</head>
<body>
<%
    if (session.getAttribute("user") != null){
        %>
欢迎<%=session.getAttribute("user")%>使用此系统！！！
<br>
<a href="Logout.jsp" >注销</a>
<%
    }else {
        response.sendRedirect("Login.jsp");
    }
%>
</body>
</html>
