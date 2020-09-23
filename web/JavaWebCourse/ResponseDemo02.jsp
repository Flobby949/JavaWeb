<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response022222</title>
</head>
<body>
<%
//    response.sendRedirect("RequestDemo1.jsp");

    //创建cookie对象
    Cookie cookie = new Cookie("njuit","南工");
    //设置cookie对象保存时间，单位为秒
    cookie.setMaxAge(3);
    //向客户端增加cookie
    response.addCookie(cookie);
    Cookie c[] = request.getCookies();
    for (int i = 0; i < c.length; i++){
        out.println(c[i].getName() + "--->" + c[i].getValue()+"<br>");
    }
    session.invalidate();
    out.println("sessionID=" + session.getId() + "<br>");
%>
</body>
</html>
