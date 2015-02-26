<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


<jsp:useBean id="UserParam" scope="request" class="general.SerchUserOnID" />

<c:set var="userparam" value="${UserParam.userParams(param.id)}" />

    <h4>Имя: </h4><c:out value="${userparam.id}"/>

</body>
</html>
