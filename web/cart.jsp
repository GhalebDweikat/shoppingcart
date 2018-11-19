<%--
  Created by IntelliJ IDEA.
  User: 986202
  Date: 11/19/2018
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
    <h1>Shopping Cart</h1>
    <c:forEach var="prod" items="${cart}">
        <p>Product: ${prod}</p>
    </c:forEach>
    <a href="/checkout">Check Out</a>
</body>
</html>
