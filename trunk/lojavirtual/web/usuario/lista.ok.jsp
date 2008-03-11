<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<title></title>
	</head>

	<body>
	    <%@ include file="../menu.jsp" %>
		<link rel="stylesheet" type="text/css" ref="css/style.css"/>
		<h1>Usuários</h1>
		<display:table id="usuario" name="${usuarios}" requestURI="usuario.lista.logic">
			<display:column property="id" sortable="true"/>
			<display:column property="login"/>
			<display:column>
			  <a href="usuario.remove.logic?usuario.id=${usuario.id}">remover</a>
			</display:column>
		</display:table>
	</body>

</html>
