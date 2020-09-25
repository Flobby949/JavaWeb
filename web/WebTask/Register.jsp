<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/24
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<table border="2" title="用户注册">
    <tr>
        <td colspan="3" style="background: deepskyblue;text-align: center;">用户注册</td>
    </tr>
    <tr>
        <td rowspan="6" width="200px"><img src="../img/a.jpg" width=180px></td>
        <td width="150px">用户名：</td>
        <td width="300px">
            <form action="#" method="POST">
                <input type="text">&nbsp;&nbsp;*
            </form>
        </td>
    </tr>
    <tr>
        <td>密码：</td>
        <td>
            <form action="#" method="POST">
                <input type="password">&nbsp;&nbsp;*
            </form>
        </td>

    </tr>
    <tr>
        <td>确认密码：</td>
        <td><form action="#" method="POST">
            <input type="password">&nbsp;&nbsp;*
        </form>
        </td>

    </tr>
    <tr>
        <td>电子邮箱</td>
        <td>
            <form action="#" method="POST">
                <input type="email">&nbsp;&nbsp;*
            </form>
        </td>

    </tr>
    <tr>
        <td>性别</td>
        <td>
            <form action="#" method="post">
                <input type="radio" name="sex" value="男">男&nbsp;
                <input type="radio" name="sex" value="女">女
            </form>
        </td>
    </tr>
    <tr>
        <td></td>
        <td>
            <form action="#" method="post">
                <input type="submit" value="提交">&nbsp;&nbsp;
                <input type="reset" value="重填">
            </form>
        </td>
    </tr>
</table>
</body>
</html>
