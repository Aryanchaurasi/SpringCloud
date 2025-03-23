<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored = "false"%>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<c:forEach var="alien" items="${result}">
    <p> ID: ${alien.aid}, Name: ${alien.aname} </p>
</c:forEach>

</body>
</html>