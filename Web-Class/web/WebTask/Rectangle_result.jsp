<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/10
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>面积</title>
</head>
<body>
<jsp:useBean id="a" class="webclass.beans.Rectangle"/>
<jsp:setProperty name="a" property="*"/>
面积 = ${a.area}
</body>
</html>
