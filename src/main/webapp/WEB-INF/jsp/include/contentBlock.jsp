<%--
  Created by IntelliJ IDEA.
  User: Roma
  Date: 18 Jul 2015
  Time: 10:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form commandName="newArticle">
    <form:button value="submit">
        <span>Сохранить и выйти</span>
    </form:button>
    <div class="boxShadow">
        <form:label path="name">Название статьи</form:label>
        <form:input path="name"/>
    </div>
    <ul></ul>
    <a href="" class="add-text-block">
        <span><spring:message code="article.text.block"/></span>
    </a>
    <a href="">
        <span><spring:message code="article.image.block"/></span>
    </a>
</form:form>
