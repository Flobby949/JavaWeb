<%@ page import="java.util.zip.DataFormatException" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: Flobby
  Date: 2020/9/16
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="refresh" content="1">
</head>
<body>

<%
    final String INFO="NIJUT";
    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh时mm分ss秒");
    String now = formatter.format(LocalDateTime.now());
%>

<h3>现在时间为：<% out.print(now); %> </h3>

<h4>现在时间为：<%=now %> </h4>

<h5>南京工业职业技术大学的简称 <%=INFO %></h5>

<%!
    int add(int x,int y){
        return x+y;
    }
%>

3+4=<%=add(3,4)%>
<%
     class Person{
        private String name;
        private int age;
        public Person(String name,int age){
            this.name = name;
            this.age = age;
        }

         @Override
         public String toString() {
             return "Person{" +
                     "name='" + name + '\'' +
                     ", age=" + age +
                     '}';
         }
     }
%>
<h2>Person实例化<%=new Person("aaaa",28)%></h2>
</body>
</html>