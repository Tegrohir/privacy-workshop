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
        <div class="progress-bar" style="width:0"></div>
    </div>

        <article>
            <h1>Binnen hoeveel dagen na constatering moet Acrobaat BV het datalek bij de Autoriteit Persoonsgegevens gemeld worden?</h1>
            <form action="question1" method="post">
                <input type="radio" name="answer" value="7 dagen" <c:if test = "${answer == null || answer == '7 dagen'}">checked</c:if>>
                7 dagen<br>
                <input type="radio" name="answer" value="3 werkdagen" <c:if test = "${answer == '3 werkdagen'}">checked</c:if>>
                3 werkdagen<br>
                <input type="radio" name="answer" value="3 dagen" <c:if test = "${answer == '3 dagen'}">checked</c:if>>
                3 dagen<br>
                <div class="buttons">
                    <a href="login" class="button previous">&laquo; Vorige</a> <input
                        class="button next" type="submit" value="Volgende &raquo;">
                </div>
            </form>
        </article>

    <footer>Copyright &copy; The Privacy Game · <a href="casus.html" target="_blank">Casus</a></footer>

</div>

</body>
</html>
