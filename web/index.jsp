<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
 <form action="newuser.jsp" method="post">
     <input type="submit" name="newuser" value="Create User"/>
 </form>
<jsp:useBean id="UserParamList" scope="request" class="general.UsersList" />

<c:set var="userparam" value="${UserParamList.usersParam}" />

<c:forEach items="${userparam}" var="user">

        <h4>Имя: </h4><c:out value="${user.nickname}"/>

        <h4>Email: </h4>   <c:out value="${user.email}"/>

        <h4>Роль: </h4>  <c:out value="${user.role}"/>

        <h4>Дата создания: </h4>  <c:out value="${user.datetimecreate}"/>

        <h4>Дата последнего изменения: </h4> <c:out value="${user.datetimeedit}"/>

        <h4>TimeZone: </h4> <c:out value="${user.timezone}"/>
    <% if (session.getAttribute("role").equals("admin")){ %>
    <form action="edituser.jsp" method="get" >
        <input type="hidden" name="id" value= "${user.id}">
        <input type="submit" name="edit" value="edit">
    </form>
    <%}%>
   <h1> ______________________________________________________________________________  </h1>
</c:forEach>

</body>
</html>
