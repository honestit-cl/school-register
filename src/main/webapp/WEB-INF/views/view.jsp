<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <c:forEach items="${students}" var="s">
            <li>${s.firstName}, ${s.lastName}</li>
        </c:forEach>
    </ul>
    <a href="addStudent">Przejdz do dodawania uczniow</a>
</body>
</html>
