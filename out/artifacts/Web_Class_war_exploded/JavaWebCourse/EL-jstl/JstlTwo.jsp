<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/6
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set value="30" var="num"/>
<br>
<c:choose>
    <c:when test="${num>50}">num数据值大于50</c:when>
    <c:when test="${num>=30}">${num}数据值大于30</c:when>
    <c:otherwise>num数据值小于30</c:otherwise>
</c:choose>
<hr>
<h4>字符串拆分</h4>
<c:set var="str" value="a135135,bb cc,dd;ee-ff"/>
<c:out value="分隔字符串结果"/>
<br>
<c:forTokens items="${str}" delims=", ;-" var="item">
    ${item}<br>
</c:forTokens>
<c:redirect url="/JavaWebCourse/SearchResult.jsp">
    <c:param name="name" value="sisisi"/>
</c:redirect>
</body>
</html>
