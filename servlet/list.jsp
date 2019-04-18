<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/17
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
    <style>
        table {

            border-collapse: collapse;

        }
        tr:hover{
            color: #ff182a;
        }
    </style>
</head>
<body>
<c:choose>
    <c:when test="${empty sessionScope.user}">
请先<a href="${pageContext.request.contextPath}/login.jsp">登录</a>
    </c:when>
<c:otherwise>
    欢迎回来，${sessionScope.user}
</c:otherwise>
</c:choose>
<table border="1px" align="center" width="400px">
    <caption><h3>用户列表</h3></caption>
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>编号</th>
    </tr>
    <c:forEach var="list" items="${requestScope.list}">
        <tr>
            <td>${list.name}</td>
            <td>${list.age}</td>
            <td>${list.id}</td>
        </tr>
    </c:forEach>
    <%--<%
       List<User> list =(List<User>)request.getAttribute("list");
       for(User u:list){
           %>
    <tr>
        &lt;%&ndash;<td><%=u.getName() %></td>&ndash;%&gt;
        <td><%=u.getName()%></td>
        <td><%=u.getAge()%></td>
        <td><%=u.getId()%></td>
    </tr>

    <%
       }
    %>--%>
</table>
</body>
</html>
