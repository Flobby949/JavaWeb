<%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/23
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>people</title>
</head>
<body>

<%
    request.setCharacterEncoding("UTF-8");
    String username = request.getParameter("name");
%>
<%!
    static StringBuffer peopleList;
    static int count = 0;

    public static void judge() {
        peopleList = new StringBuffer();
    }

    public static void addPerson(String username) {
        peopleList.append(username);
    }
%>
<%
    if (count == 0) {
        judge();
%>
<%
    if (username.length() <= 10 && username.length() > 0) {
        count++;
        addPerson(username);
%>
<%
    out.println("count = " + count + "\npeopleList = " + peopleList.length());
%>
<a href="InputName.jsp">返回提交页面</a>
<%
} else {
%>
<jsp:forward page="InputName.jsp"/>
<%
    }
} else {
    if (username.length() <= 10 && username.length() > 0) {
        count++;
        addPerson(username);
%>
<%
    out.println("count = " + count + "\n peopleList = " + peopleList.length());
%>
<a href="InputName.jsp">返回提交页面</a>
<%
} else {
%>
<jsp:forward page="InputName.jsp"/>
<%
        }
    }
%>
</body>
</html>
