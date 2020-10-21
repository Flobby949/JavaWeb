<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/10/21
  Time: 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数组求和结果</title>
</head>
<body>
<!--服务器跳转-->
<jsp:useBean id="seriesBean" type="webclass.beans.SeriesBean" scope="request"/>
<table>
    <tr>
        <th>${seriesBean.name}</th>
        <th>首项</th>
        <th>公差</th>
        <th>结果</th>
    </tr>
    <tr>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/</td>
        <td>${seriesBean.firstItem}</td>
        <td>${seriesBean.var}</td>
        <td>${seriesBean.sum}</td>
    </tr>
</table>
</body>
</html>
