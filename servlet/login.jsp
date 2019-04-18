<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/18
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>

<h1>${requestScope.msg}</h1>
<form method="post" action="${pageContext.request.contextPath}/ServletLogin">
    姓名<input type="text" name="name" />
    密码<input type="password" name="password" />
    <input type="submit" value="登录">


</form>
</body>
</html>
