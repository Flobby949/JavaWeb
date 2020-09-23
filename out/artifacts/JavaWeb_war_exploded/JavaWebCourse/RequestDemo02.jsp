<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request2222222</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String[] inst = request.getParameterValues("inst");

    // 一次性获取所有参数
    Enumeration enumeration = request.getParameterNames();
    while (enumeration.hasMoreElements()){
        out.println("参数名："+(String)enumeration.nextElement()+"<br>");
    }

%>

姓名:<%=name%>
爱好:
<%
    if (inst != null) {
        for (int i = 0; i < inst.length; i++) {
%>

<%=inst[i]%> &nbsp;&nbsp;

<%
        }
    }
%>
</body>
</html>
