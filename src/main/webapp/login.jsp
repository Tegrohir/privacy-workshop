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

    <article>
        <h1>Vul je code in</h1>
        <c:if test="${message != null}">
            <p><c:out value="${message}"/></p>
        </c:if>


        <form action="login" method="post">
            <input type="text" name="code"><br>
            <div class="buttons">
                <a href="start" class="previous">&laquo; Previous</a> <input
                    class="next" type="submit" value="Next &raquo;">
            </div>
        </form>
    </article>

    <footer>Copyright &copy; The Privacy Game</footer>

</div>

</body>
</html>
