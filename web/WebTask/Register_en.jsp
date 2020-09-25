<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/24
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>en</title>
</head>
<body>
<table border="2" title="用户注册">
    <tr>
        <td colspan="3" style="background: deepskyblue;text-align: center;">Create an Account</td>
    </tr>
    <tr>
        <td rowspan="6" width="200px"><img src="../img/a.jpg" width=180px></td>
        <td width="150px">Account：</td>
        <td width="300px">
            <form action="#" method="POST">
                <input type="text">&nbsp;&nbsp;*
            </form>
        </td>
    </tr>
    <tr>
        <td>Password：</td>
        <td>
            <form action="#" method="POST">
                <input type="password">&nbsp;&nbsp;*
            </form>
        </td>

    </tr>
    <tr>
        <td>Confirm Password：</td>
        <td><form action="#" method="POST">
            <input type="password">&nbsp;&nbsp;*
        </form>
        </td>

    </tr>
    <tr>
        <td>E-mail Address</td>
        <td>
            <form action="#" method="POST">
                <input type="email">&nbsp;&nbsp;*
            </form>
        </td>

    </tr>
    <tr>
        <td>Sex:</td>
        <td>
            <form action="#" method="post">
                <input type="radio" name="sex" value="Male">Male&nbsp;
                <input type="radio" name="sex" value="Female">Female
            </form>
        </td>
    </tr>
    <tr>
        <td></td>
        <td>
            <form action="#" method="post">
                <input type="submit" value="Submit">&nbsp;&nbsp;
                <input type="reset" value="Reset">
            </form>
        </td>
    </tr>
</table>
</body>
</html>
