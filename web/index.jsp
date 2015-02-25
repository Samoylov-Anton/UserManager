<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<jsp:useBean id="UserParamList" scope="request" class="general.UsersList" />

<c:set var="userparam" value="${UserParamList.usersParam}" />

<c:forEach items="${userparam}" var="user">
    <h2>
        <c:out value="${user.nickname}"/>
    </h2>
    <h2>
        <c:out value="${user.email}"/>
    </h2>
    <h2>
        <c:out value="${user.role}"/>
    </h2>
    <h2>
        <c:out value="${user.email}"/>
    </h2>
</c:forEach>

</body>
</html>
