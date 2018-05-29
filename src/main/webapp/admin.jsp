<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Admin</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<header>
		<h1>Admin</h1>
	</header>

	<div class="container">		
		<article>
			<h1>Overzicht inzendingen</h1>
			<c:choose>
				<c:when test="${empty guests}">
					<p>Er zijn geen gasten gevonden.</p>
				</c:when>
				<c:otherwise>
					<table id="history">
						<tr>
							<th>Gast Sessie</th>
							<th>Team</th>
							<th>Rol</th>
							<th>Antwoorden</th>
						</tr>
						<c:forEach items="${guests}" var="guest">
							<tr>
								<td><c:out value="${guest.session}" /></td>
								<td><c:out value="${guest.team}" /></td>
								<td><c:out value="${guest.role}" /></td>
								<td><c:forEach items="${guest.answers}" var="answer">
										<c:out value="${answer}" /><br>
									</c:forEach></td>
							</tr>
						</c:forEach>
					</table>
				</c:otherwise>
			</c:choose>
		</article>
	</div>
	
	<footer>Copyright &copy; The Privacy Game</footer>
</body>
</html>
