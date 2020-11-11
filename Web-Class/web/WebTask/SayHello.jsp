<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/6
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>SayHello</title>
</head>
<body>
<%!
    public static int getHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
%>
<%
    Integer hour = getHour(new Date());
    request.setAttribute("hour",hour);
%>
<c:set value="${hour}" var="hours" property="hours"/>
<c:if test="${hours>=6&&hours<12}">
    上午好
</c:if>
<c:if test="${hours>=12&&hours<18}">
    下午好
</c:if>
<c:if test="${hours>=18||hours<6}">
    晚上好
</c:if>
</body>
</html>
