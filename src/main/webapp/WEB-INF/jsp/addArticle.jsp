<%--
  Created by IntelliJ IDEA.
  User: Roma
  Date: 18 Jul 2015
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <spring:url value="/resources/css/styles.css" var="styles"/>
    <link href="${styles}" rel="stylesheet" />
    <script type="text/javascript" src="jquery-1.11.3.js"></script>
    <spring:url value="/resources/js/main.js" var="mainjs"/>
    <script type="text/javascript" src="${mainjs}"></script>
    <title><spring:message code="article.title"/></title>
</head>
<body>
    <header><spring:message code="article.header"/></header>
    <jsp:include page="include/contentBlock.jsp"/>
</body>
</html>
