<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title></title>
</head>
<body>
<h1>Loja Virtual - Login </h1>

<form action="admin.efetuaLogin.logic" method="post">
	Login:<br>
	<input type="text" name="usuario.login"> <br>
	Senha:<br>
	<input type="password" name="usuario.senha"><br>
	<input type="submit">
</form>
</body>
</html>
