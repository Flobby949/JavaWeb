<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>特殊操作</title>
</head>
<body>
<%
    //获取客户端提交的方法
    String method = request.getMethod();
    //获取客户端IP地址
    String ip = request.getRemoteAddr();
    //获取访问路径(相对路径）
    String path1 = request.getServletPath();
    //获取上下文路径(相对路径）
    String path2 = request.getContextPath();
    //获取绝对路径
    String path3 = pageContext.getServletContext().getRealPath("/");
    //获取请求路径
    String path4 = request.getRequestURI();
    String path5 = request.getRequestURL().toString();
%>
<h3>method=<%=method%></h3>
<h3>ip=<%=ip%></h3>
<h3>访问路径：<%=path1%></h3>
<h3>上下文路径：<%=path2%></h3>
<h3>当前文件绝对路径：<%=path3%></h3>
<h3>请求路径：<%=path4%></h3>
<h3><%=path5%></h3>
</body>
</html>