<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/20
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<%
    String id = request.getParameter("id");
%>
<h1>编号：<%=id%></h1>
<form action="empServlet?action=update&id=<%=id%>" method="post">
    姓名：<input type="text" name="name"><br>
    工作：<input type="text" name="job"><br>
    工资：<input type="text" name="sal"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
