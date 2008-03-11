<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Cadastro de Usuários</title>
</head>

<body>

    <%@ include file="../menu.jsp" %>
	<link rel="stylesheet" type="text/css" ref="css/style.css"/>
	<h1>Cadastro de usuarios</h1>
	<form action="usuario.adiciona.logic">
		Login :<input type="text" name="usuario.login"/> <br/>
		Senha :<input type="text" name="usuario.senha"/> <br/>
		<input type="submit"/>
  	</form>
		
</body>
</html>
