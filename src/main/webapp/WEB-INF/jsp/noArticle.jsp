<%--
  Created by IntelliJ IDEA.
  User: Roma
  Date: 27 Jul 2015
  Time: 2:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Нет такой статьи</title>
</head>
<body>
    <div class="boxShadow">
        <span>Статья '<c:out value="${emptyArticle.name}"/>' не найдена.</span>
    </div>
    <a href="/articles.html"><span>Вернуться к списку статей</span></a>
</body>
</html>
