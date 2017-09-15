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
        <td>Stezenie w momencie przerwania picia:</td>
        <td>${breathalyser.getConcentrationOfAlcoholWhenStopDrinking()}</td>
    </tr>
    <tr>
        <td>Aktualne stezenie alkoholu:</td>
        <td>${breathalyser.getConcentrationOfAlcoholNow()}</td>
    </tr>
    <tr>
        <td>Ilosc godzin do calkowitego wytrzezwienia:</td>
        <td>${breathalyser.howManyHoursToAlcoholVanish()}</td>
    </tr>
</table>
</body>
</html>
