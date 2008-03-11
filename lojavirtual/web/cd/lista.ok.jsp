<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" ref="css/displaytag.css"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title></title>
</head>
<body>
	<%@ include file="../menu.jsp" %>
	
	<h1>CDs</h1>
	
	<display:table id="cd" name="${cds}" requestURI="cd.lista.logic">
	 <display:column property="id"/>
	 <display:column property="titulo" sortable="true"/>
	 <display:column property="artista" sortable="true"/>
	 <display:column property="genero" sortable="true"/>

 	 <display:column>
		<a href="cd.editar.logic?cd.id=${cd.id}">editar</a>
	 </display:column>

	 <display:column>
		<a href="cd.remove.logic?cd.id=${cd.id}">remover</a>
	 </display:column>
	</display:table>
	
</body>
</html>
