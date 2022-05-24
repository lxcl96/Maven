<%@ page import="com.ly.maven.Message" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/5/24
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% String message = new Message().getMessage();%>
    <h1>
        <%=message%>
    </h1>
</body>
</html>
