<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: Ewa
  Date: 2017-09-08
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>BreathalyserResult</title>
</head>
<body>
<h2>Wynik</h2>
<table>
    <tr>
        <td>Ilość</td>
        <td>${breathalyser.quantity}</td>
    </tr>
    <tr>
        <td>Typ</td>
        <td>${breathalyser.typ}</td>
    </tr>
    <tr>
        <td>Procent</td>
        <td>${breathalyser.displayResult()}</td>
    </tr>
</table>
</body>
</html>
