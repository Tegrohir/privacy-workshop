<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>The Privacy Game</title>
    <link rel="icon" type="image/png" href="img/favicon.png">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<div class="container">

    <header>
        <h1>The Privacy Game</h1>
    </header>

    <div class="progress-container">
        <div class="progress-bar" style="width:57%"></div>
    </div>

    <article>
        <h1>Welke van onderstaande zijn bijzondere persoonsgegevens? </h1>
        <p>Toelichting: het team dient het beste antwoord uit zoeken op
            basis van onderzoek op internet.</p>
        <form action="question5" method="post">
            <input type="radio" name="answer" value="Leeftijd" <c:if test = "${answer == null || answer == 'Leeftijd'}">checked</c:if>>
            Leeftijd
            <br>
            <input type="radio" name="answer" value="Telefoonnummer" <c:if test = "${answer == 'Telefoonnummer'}">checked</c:if>>
            Telefoonnummer
            <br>
            <input type="radio" name="answer" value="Godsdienst" <c:if test = "${answer == 'Godsdienst'}">checked</c:if>>
            Godsdienst
            <br>
            <input type="radio" name="answer" value="Adres" <c:if test = "${answer == 'Adres'}">checked</c:if>>
            Adres
            <br>
            <div class="buttons">
                <a href="question4" class="button previous">&laquo; Vorige</a> <input
                    class="button next" type="submit" value="Volgende &raquo;">
            </div>
        </form>
    </article>

    <footer>Copyright &copy; The Privacy Game · <a href="casus.html" target="_blank">Casus</a></footer>

</div>

</body>
</html>
