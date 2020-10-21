<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/16
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showData</title>
</head>
<body>
<h1><%=request.getMethod()%></h1>
<br>
${requestScope.data}
</body>
</html>
