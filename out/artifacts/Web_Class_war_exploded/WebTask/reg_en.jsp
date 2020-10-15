<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/24
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>en</title>
</head>
<body>
<form name="form" method="post" action="change.jsp">
    请选择语言：
    <select name="language"  onChange="this.form.submit()">
        <option value="english">---ENGLISH---</option>
        <option value="chinese">---CHINESE---</option>
    </select>
</form>
<jsp:include page="Register_en.jsp"/>
</body>
</html>
