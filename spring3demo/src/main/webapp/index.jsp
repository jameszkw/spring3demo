<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/16 0016
  Time: 下午 4:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>welcome!</h1>
    <font size="2">
        request主要方法调用示例：<br>
        <%
            request.setAttribute("attr","Hello!");
            out.println("attr属性的值为："+request.getAttribute("attr")+"<br>");
            out.println("上下文路径为："+request.getContextPath()+"<br>");
            out.println("Cookies:"+request.getCookies()+"<br>");
            out.println("Host:"+request.getHeader("Host")+"<br>");
            out.println("ServerName:"+request.getServerName()+"<br>");
            out.println("ServerPort:"+request.getServerPort()+"<br>");
            out.println("RemoteAddr:"+request.getRemoteAddr()+"<br>");
            request.removeAttribute("attr");
            out.println("属性移除操作以后attr属性的值为："+request.getAttribute("attr")+"<br>");
        %>
    </font>
</body>
</html>
