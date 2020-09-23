<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航栏</title>
    <style type="text/css">
        a{
            text-decoration: none;
        }
        header>div#barLeft>nav{
            float: left;
        }
        header>div#barRight>nav{
            float: right;
        }
    </style>
</head>
<body>
<header>
    <div id="barLeft">
        <nav>
            <a href="#">&nbsp;&nbsp;新闻</a>&nbsp;&nbsp;
            <a href="#">hao123</a>&nbsp;&nbsp;
            <a href="#">地图</a>&nbsp;&nbsp;
            <a href="#">视频</a>&nbsp;&nbsp;
            <a href="#">贴吧</a>&nbsp;&nbsp;
            <a href="#">学术</a>&nbsp;&nbsp;
            <a href="#">更多</a>&nbsp;&nbsp;
        </nav>
    </div>
    <div id="barRight">
        <nav>
           <a href="#">设置&nbsp;&nbsp;</a>
           <button>登录</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </nav>
    </div>
</header>
</body>
</html>
