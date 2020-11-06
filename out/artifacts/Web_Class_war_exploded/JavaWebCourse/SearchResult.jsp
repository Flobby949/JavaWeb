<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/4
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>调查问卷结果</title>
</head>
<body>
姓名：${param.name}
爱好：${(paramValues.hobby[0]==null&&paramValues.hobby[1]==null&&paramValues.hobby[2]==null)?"无":""}
      ${paramValues.hobby[0]} ${paramValues.hobby[1]} ${paramValues.hobby[2]}

</body>
</html>
