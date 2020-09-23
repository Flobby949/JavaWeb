<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020-9-18
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scope22222</title>
</head>
<body>
<jsp:forward page="scope3.jsp"></jsp:forward>
<%
    request.setCharacterEncoding("utf-8");
    /*获取page属性范围的数据值*/
    /*
    String name=(String) request.getAttribute("name");
    Integer age=(Integer) request.getAttribute("age");
     */
    String name=(String) application.getAttribute("name");
    Integer age=(Integer) application.getAttribute("age");
    /*
    String name=(String) session.getAttribute("name");
    Integer age=(Integer) session.getAttribute("age");
     */
%>
<%--输出属性值--%>
<h2>姓名：<%=name%></h2>
<h2>年龄：<%=age%></h2>
</body>
</html>
