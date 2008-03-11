<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title></title>
</head>



<body>


 <ul id="errors">
 	<c:forEach var="error" items="${errors.iterator}">
 		<li>${error.key}</li>
 	</c:forEach>
 </ul>

	<%@ include file="../menu.jsp" %>
	<h1>Cadastro de música</h1>
	
	<form action="musica.armazena.logic" method="post">
	  <input type="hidden" name="musica.id" value="${musica.id}">
	  CD:<br>
	  <select name="musica.cd.id">
	    <c:forEach var="cd" items="${listaCds}">
	      <option value="${cd.id}" 
	      <c:if test="${musica.cd.id == cd.id}">selected="true" </c:if>
	      >${cd.titulo}
	      </option>
	     </c:forEach>
	  </select><br>
	  Titulo<br>
	  <input type="text" name="musica.titulo" value="${musica.titulo}"/><br>
	  Preco<br>
	  <input type="text" name="musica.preco" value="${musica.preco}"/>
	  <input type="submit"/>
	</form>
</body>
</html>
