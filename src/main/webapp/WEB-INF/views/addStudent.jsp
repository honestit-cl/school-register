<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Adding students</title>
</head>
<body>
<div>
    <form:form method="post"
               modelAttribute="student">
    Imie:<form:input path="firstName" />
        <form:errors path="firstName"/>

    Nazwisko:<form:input path="lastName" />
        <form:errors path="lastName"/>

        <input type="submit" value="Zapisz ucznia do bazy">
    </form:form>

    <a href="view">Wyswietl liste uczniow</a>

</div>

</body>
</html>
