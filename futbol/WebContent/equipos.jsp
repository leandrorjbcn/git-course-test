<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="equipo" items="${equipos}">
<div style="display:inline-flex; border:1px solid black;">
	
	<a href="Controlador?action=consulta_jugadores&equipo_cod=${equipo.equipo_cod}&foto_escudo=${equipo.foto_escudo}&foto_equipo=${equipo.foto_equipo}"><img src="img/${equipo.foto_escudo}"></a>
	<div>
		<c:out value="${equipo.nombre}"></c:out><br>
		<c:out value="${equipo.fundacion}"></c:out><br>
		<c:out value="${equipo.presidente}"></c:out><br>
	</div>
	
</div>	
</c:forEach>



</body>
</html>