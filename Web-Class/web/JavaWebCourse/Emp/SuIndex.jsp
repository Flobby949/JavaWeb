<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/11/27
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--实现文件上传，表单必须用enctype封装--%>
<%--使用smartUpload上传时，普通参数必须用此类的getRequest方法获取--%>
<form action="suDo" enctype="multipart/form-data" method="post">
    姓名：<input type="text" name="name"> <br>
    头像：<input type="file" name="avatar"> <br>
    <input type="submit" value="提交"> &nbsp;&nbsp;
    <input type="reset" value="重置">
</form>
</body>
</html>
