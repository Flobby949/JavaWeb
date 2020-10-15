<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/10
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
<jsp:useBean id="p" class="webclass.beans.CalculationWork"/>
<jsp:setProperty name="p" property="*"/>
计算结果 = ${p.resultNumber}
</body>
</html>