<%--
  Created by IntelliJ IDEA.
  User: Roma
  Date: 27 Jul 2015
  Time: 1:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Статья | <c:out value="${article.name}"/> </title>
</head>
<body>
    <h3><c:out value="${article.name}"/></h3>
    <c:forEach var="block" items="${article.contentBlocks}">
        <p>${block}</p>
    </c:forEach>
</body>
</html>
