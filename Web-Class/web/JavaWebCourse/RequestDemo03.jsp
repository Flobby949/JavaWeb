<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取头信息</title>
</head>
<body>
<%
    Enumeration enumeration = request.getHeaderNames();
    while (enumeration.hasMoreElements()){
        String headName = (String)enumeration.nextElement();
        String headValue = (String)request.getHeader(headName);
%>

<h4><%=headName%>:<%=headValue%></h4>

<%
    }
%>
</body>
</html>
