<%@ page import="webclass.java.UserInfo" %><%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/9
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $web-class$
  <%
    UserInfo user1 = new UserInfo("张三","123");
    UserInfo user2 = new UserInfo("李四","123");
    session.setAttribute("user",user1);
    session.setAttribute("user",user2);
    session.removeAttribute("user");
  %>
  </body>
</html>
