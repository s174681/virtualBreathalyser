<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>BreathalyserResult</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
        <td>${breathalyser.type}</td>
    </tr>
    <tr>
        <td>Procent</td>
        <td>${breathalyser.displayResult()}</td>
    </tr>
</table>
</body>
</html>
