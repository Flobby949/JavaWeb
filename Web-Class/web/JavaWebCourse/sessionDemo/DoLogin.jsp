<%@ page import="java.lang.management.PlatformLoggingMXBean" %><%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>doDoDoDoDo</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String psd = request.getParameter("password");

    if (name != null && psd != null && name.equals(psd)){
        session.setAttribute("user",name);
        response.setHeader("refresh","3;URL=Welcome.jsp");
        out.println("用户名密码正确，即将跳转到欢迎界面");
    }else {
        request.setAttribute("name",name);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("errorLogIn.jsp");
        requestDispatcher.forward(request,response);
        /*response.setHeader("refresh","3;URL=Login.jsp");
        out.println("用户名密码错误，即将返回登录界面");*/
    }
%>
</body>
</html>
