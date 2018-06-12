<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<header>
		<h1>Admin</h1>
	</header>

	<div class="container">
		<article>
			<h1>Overzicht inzendingen</h1>
			<c:choose>
				<c:when test="${empty teams}">
					<p>Er zijn geen teams gevonden.</p>
				</c:when>
				<c:otherwise>

				<c:forEach items="${teams}" var="team">
					<h1>Team <c:out value="${team.id}" /> (code: <c:out value="${team.code}" />)</h1>
					
					<c:choose>
						<c:when test="${empty team.answers}">
							<p>Er zijn geen antwoorden gevonden.</p>
						</c:when>
						<c:otherwise>
							<table id="history">
								<tr>
									<th>Antwoord</th>
									<th>Tijd</th>
								</tr>
								<c:forEach items="${team.answers}" var="answer">
								<tr>
									<td><c:out value="${answer.text}" /></td>
									<td><fmt:formatDate pattern = "dd-MM-yyyy HH:mm:ss" value = "${answer.date}" /></td>
								</tr>
								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				
				</c:otherwise>
			</c:choose>
		</article>
	</div>

	<footer>Copyright &copy; The Privacy Game</footer>
</body>
</html>
