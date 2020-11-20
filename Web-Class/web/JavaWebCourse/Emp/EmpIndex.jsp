<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/20
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<c:redirect url="/JavaWebCourse/Emp/empServlet">
    <c:param name="action" value="showAll"/>
</c:redirect>
</body>
</html>