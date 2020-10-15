<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/24
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>change</title>
</head>
<body>
<%
    String s = request.getParameter("language");
    System.out.println(s);
    if ("english".equals(s)) {
%>
<jsp:forward page="reg_en.jsp"></jsp:forward>
<%
} else{
%>
<jsp:forward page="reg.jsp"></jsp:forward>
<%
    }
%>
</body>
</html>
