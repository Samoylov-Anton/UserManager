

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="/check" method="POST">
    Name: <input type="text" name="nickname"/>
    Email: <input type="text" name="email"/>
    Password: <input type="text" name="password" />
    <%if (session.getAttribute("error") != null){ %>
    <%= session.getAttribute("error")%>
    <%} %>
    <input type="submit" name="creatuser" value="Create"/>
</form>

</body>
</html>
