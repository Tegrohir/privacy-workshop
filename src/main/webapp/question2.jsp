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
        <div class="progress-bar" style="width:14%"></div>
    </div>

    <article>
        <h1>Wanneer moet Acrobaat BV een Functionaris Gegevensbescherming aanstellen?</h1>
        <p>Toelichting: het team dient het beste antwoord uit zoeken op
            basis van onderzoek op internet.</p>
        <form action="question2" method="post">
            <textarea name="answer"><c:choose><c:when test="${answer == null}">Antwoord voor jouw team</c:when><c:otherwise><c:out value="${answer}"/></c:otherwise></c:choose></textarea>
            <br>
            <div class="buttons">
                <a href="question1" class="previous">&laquo; Vorige</a> <input
                    class="next" type="submit" value="Volgende &raquo;">
            </div>
        </form>
    </article>

    <footer>Copyright &copy; The Privacy Game</footer>

</div>

</body>
</html>
