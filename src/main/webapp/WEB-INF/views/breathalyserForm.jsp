<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ewa
  Date: 2017-09-08
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BreathalyserForm</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Beathalyser Virtual</h2>
    <%--@elvariable id="breathalyserResult" type="com.ewa.pl.controller.BreathalyserController"--%>
    <%--<form:form action="/breathalyserResult" modelAttribute="breathalyserResult" class="form-horizontal" method="POST">--%>
        <form:form action="." modelAttribute="breathalyserForm" class="form-horizontal" method="POST">
        <div class="form-group">
            <label class="control-label col-sm-2" id="gender" for="gender">Płęć:</label>
            <div class="col-sm-10">
                <label class="radio-inline">
                    <input type="radio" id="genderM" name="gender" path="gender" value="Male">Mężczyzna
                </label>
                <label class="radio-inline">
                    <input type="radio" id="genderF" name="gender" path="gender" value="Female">Kobieta
                </label>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" id="weightL" for="weight">Waga:</label>
            <div class="col-sm-10">
                <input path="weight" name="weight" id="weight" type="number" min="30" max="150" required/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" id="heightL" for="height">Wzrost:</label>
            <div class="col-sm-10">
                <input path="height" name="height" id="height" type="number" min="110" max="250" required/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="age">Wiek:</label>
            <div class="col-sm-10">
                <input path="age" id="age" type="number" name="age" min="18" max="100" required>
            </div>
        </div>
        <div class="form-group">
            <label for="startDrinking">Godzina rozpoczęcia:</label>
            <select class="form-control" path="startDrinking" id="startDrinking" name="startDrinking" >
                <option value="0">0:00</option>
                <option value="1">1:00</option>
                <option value="2">2:00</option>
                <option value="3">3:00</option>
                <option value="4">4:00</option>
                <option value="5">5:00</option>
                <option value="6">6:00</option>
                <option value="7">7:00</option>
                <option value="8">8:00</option>
                <option value="9">9:00</option>
                <option value="10">10:00</option>
                <option value="11">11:00</option>
                <option value="12">12:00</option>
                <option value="13">13:00</option>
                <option value="14">14:00</option>
                <option value="15">15:00</option>
                <option value="16">16:00</option>
                <option value="17">17:00</option>
                <option value="18">18:00</option>
                <option value="19">19:00</option>
                <option value="20">20:00</option>
                <option value="21">21:00</option>
                <option value="22">22:00</option>
                <option value="23">23:00</option>
            </select>
        </div>
        <div class="form-group">
            <label for="time">Czas trwania:</label>
            <select class="form-control" id="time" name="time" path="time">
                <option value="15">15 minut</option>
                <option value="30">30 minut</option>
                <option value="60">1 godzin</option>
                <option value="120">2 godzin</option>
                <option value="180">3 godzin</option>
                <option value="240">4 godzin</option>
                <option value="300">5 godzin</option>
                <option value="360">6 godzin</option>
                <option value="420">7 godzin</option>
                <option value="480">8 godzin</option>
                <option value="720">dłużej</option>
            </select>
        </div>
        <div class="row">
            <div class="col-xs-6 col-sm-3">
                <%--@declare id="quantity"--%><label for="quantity">Ilość<i>[szt.]</i></label>
            </div>
            <div class="col-xs-6 col-sm-3">
                <%--@declare id="typ"--%><label for="typ">Typ alkoholu</label>
            </div>
            <div class="col-xs-6 col-sm-3">
                <%--@declare id="procent"--%><label for="procent">Zawartość<i>[%]</i></label>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-6 col-sm-3">
                <select class="form-control" name="quantity" id="quantity" path="quantity">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                </select>
            </div>
            <div class="col-xs-6 col-sm-3">
                <select name="typ" id="typ" class="form-control" path="typ">
                    <option value="330">Małe piwo (0,33)</option>
                    <option value="500">Duże piwo (0,5)</option>
                    <option value="50">50ml kieluszek wódki</option>
                    <option value="100">100ml kieluszek wódki</option>
                    <option value="200">Lampka wina</option>
                    <option value="750">Butelka wina</option>
                    <option value="25">Mały drink</option>
                    <option value="50">Duży drink</option>
                </select>
            </div>
            <div class="col-xs-6 col-sm-3">
                <input path="procent" name="procent" type="number" id="procent" min="0" max="100">
            </div>
        </div>

        <br>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default" name="submit">Oblicz</button>
            </div>
        </div>

    </form:form>
</div>
</body>
</html>
