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
        <h1>Casus inleiding</h1>

        <p>
            <b>Acrobaat BV</b> is een IT bedrijf werkzaam op het gebied van
            grafische software ontwikkeling.
        </p>
        <p>Het belangrijkste product dat Acrobaat BV levert zijn software
            licenties voor hun grafische software. Zij leveren direct aan
            Midden-Groot bedrijven.</p>
        <p>Acrobaat BV gebruikt een on-premise CRM systeem voor het
            onderhouden en bijhouden van klantcontact.</p>
        <p>Acrobaat BV krijgt zo de beschikking over enorme hoeveelheden
            gevoelige en minder gevoelige persoonsgegevens betreffende duizenden
            klanten. Hieronder vallen bijvoorbeeld gegevens als correspondentie
            met de klant of financiÃ«le gegevens.</p>
        <p>De klantdata worden om redenen van veiligheid en
            vertrouwelijkheid, opgeslagen op een dedicated database server. Deze
            database server wordt door Acrobaat BV zelf beheerd.</p>

        <h1>Casusbeschrijving</h1>

        <p>Op 18 mei 2018 krijgt de IT afdeling van Acrobaat BV een
            melding van hun IDS (Intrusion Detection System) dat er sprake is
            geweest van ongeautoriseerde toegang tot de CRM database server van
            Acrobaat BV. De IT afdeling is nog bezig de oorzaak en gevolgen van
            het lek in kaart te brengen.</p>
        <p>De IT afdeling van Acrobaat BV meldt dit lek conform procedure
            aan de afdeling Juridische Zaken (JZ), die vervolgens de directie op
            de hoogte stelt.</p>
        <p>Op 20 mei 2018 bericht het NOS in het journaal van 20:00 uur
            dat zij informatie in handen heeft waaruit blijkt dat mogelijk
            honderden klantgegevens door hackers zijn buitgemaakt bij een hack
            bij Acrobaat BV.</p>
        <p>Het is volgens NOS nog onduidelijk hoe de hack heeft kunnen
            gebeuren en hoeveel informatie er precies is gelekt. Wel is volgens
            NOS bekend dat het mogelijk zou gaan om bijzonder gevoelige
            persoonsgegevens die een bijna compleet beeld kunnen geven van het
            koopgedrag van klanten en de bedrijfs-financiÃ«le situatie. Volgens
            NOS heeft de Autoriteit Persoonsgegevens aangeven onderzoek te
            zullen doen naar het lek.</p>

        <article>
            <h1>Binnen hoeveel uur na constatering moet Acrobaat BV het datalek bij de Autoriteit Persoonsgegevens gemeld worden?</h1>
            <form action="question1" method="post">
                <input type="radio" name="answer" value="7 dagen" <c:if test = "${answer == null || answer == '7 dagen'}">checked</c:if>>
                7 dagen<br>
                <input type="radio" name="answer" value="3 werkdagen" <c:if test = "${answer == '3 werkdagen'}">checked</c:if>>
                3 werkdagen<br>
                <input type="radio" name="answer" value="3 dagen" <c:if test = "${answer == '3 dagen'}">checked</c:if>>
                3 dagen<br>
                <div class="buttons">
                    <a href="login" class="previous">&laquo; Vorige</a> <input
                        class="next" type="submit" value="Volgende &raquo;">
                </div>
            </form>
        </article>
    </article>

    <footer>Copyright &copy; The Privacy Game</footer>

</div>

</body>
</html>