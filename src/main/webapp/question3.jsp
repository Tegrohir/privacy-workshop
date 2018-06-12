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
        <div class="progress-bar" style="width:28%"></div>
    </div>

    <article>
        <h1>In welke van onderstaande situaties worden persoonsgegevens verwerkt? </h1>
        <p>Toelichting: het team dient het beste antwoord uit zoeken op
            basis van onderzoek op internet.</p>
        <form action="question3" method="post">
            <input type="radio" name="answer"
                   value="Een website trackt de bezoekersaantallen en een medewerken bekijkt deze." checked>
            Een website trackt de bezoekersaantallen en een medewerken bekijkt deze.
            <br>
            <input type="radio" name="answer"
                   value="Een werknemer bij Acrobaat BV bekijkt de financiÃ«le prestaties van het bedrijf en verwerkt deze in een rapport.">
            Een werknemer bij Acrobaat BV bekijkt de financiÃ«le prestaties van het bedrijf en verwerkt deze in een rapport.
            <br>
            <input type="radio" name="answer"
                   value="Een bedrijf wijzigt de licentie van een klant.">
            Een bedrijf wijzigt de licentie van een klant.
            <br>
            <input type="radio" name="answer" value="Een werknemer raadpleegt een email lijst.">
            Een werknemer raadpleegt een email lijst.
            <br>
            <div class="buttons">
                <a href="question2" class="previous">&laquo; Vorige</a> <input
                    class="next" type="submit" value="Volgende &raquo;">
            </div>
        </form>
    </article>

    <footer>Copyright &copy; The Privacy Game</footer>

</div>

</body>
</html>