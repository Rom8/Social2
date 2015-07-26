<%--
  Created by IntelliJ IDEA.
  User: Roma
  Date: 20 Jul 2015
  Time: 12:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Статьи</title>
</head>
<body>
<ul>
    <c:forEach var="article" items="${articles}">
        <p>
            <a href="/articles/${article.name}.html"><c:out value="${article.name}"/></a>
        </p>
    </c:forEach>
</ul>
</body>
</html>