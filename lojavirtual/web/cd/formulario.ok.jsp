<%@ include  file="../menu.jsp"  %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Cadastra CD</title>
  <script src="../javascripts/valida_cd.js"> </script>
   <script type="text/javascript"> 
</head>
<body>

 <ul id="errors">
 	<c:forEach var="error" items="${errors.iterator}">
 		<li>${error.key}</li>
 	</c:forEach>
 </ul>

	<link rel="stylesheet" type="text/css" ref="css/style.css"/>
	<h1>Cadastro de Cd</h1>
	<form action="cd.armazena.logic" method="post" onSubmit="return validaForm();">
		<input type="hidden" name="cd.id" value="${cd.id}"/>
		Titulo:<br>
		<input type="text" name="cd.titulo" value="${cd.titulo}" id="cd_titulo"/><br>
		Artista:<br>
		<input type="text" name="cd.artista" value="${cd.artista}"/><br>
		Genero:<br>
		<input type="text" name="cd.genero" value="${cd.genero}"/><br>
		
        <input type="submit" value="Cadastrar" onclick="recarrega();">  
    </form>
</body>
</html>
