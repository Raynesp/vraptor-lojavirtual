<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>
<body>

<%@ include file="../menu.jsp"%>
<h1>Musicas</h1>
<display:table id="musica" name="${musicas}"
	requestURI="musica.lista.logic">
	<display:column property="id" />
	<display:column property="cd.titulo" sortable="true" title="CD" />
	<display:column property="titulo" sortable="true" />
	<display:column property="preco" sortable="true" />
	<display:column>
		<a href="musica.editar.logic?musica.id=${musica.id}">editar</a>
	</display:column>
	<display:column>
		<a href="musica.remove.logic?musica.id=${musica.id}">remover</a>
	</display:column>
</display:table>
</body>
</html>
