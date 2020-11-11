<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/6
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>投票结果</title>
</head>
<body>
    <h3>一号    :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ${empty applicationScope.result["one"]? 0 :applicationScope.result["one"]}
    </h3>
    <h3>二号    :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ${empty applicationScope.result["two"]? 0 :applicationScope.result["two"]}

    </h3>
    <h3>三号    :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ${empty applicationScope.result["three"]? 0 :applicationScope.result["three"]}

    </h3>
    <h3>四号    :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ${empty applicationScope.result["four"]? 0 :applicationScope.result["four"]}

    </h3>
    <h3>五号    :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ${empty applicationScope.result["five"]? 0 :applicationScope.result["five"]}

    </h3>

    <h3> 合计：${applicationScope.total}人投票！</h3>
        <br>
    <input type="button" name="goBack" value="返回" onClick="window.location.href='Vote.jsp'">
</body>
</html>