<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.cursoja.agendacurso.model.entidade.Curso" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar Curso</title>
</head>
<body>

	<form action="CursoExecutarAlterarServlet" method="post">
	
	<%  
	
	Curso cursoAlterar = (Curso) request.getAttribute("curso");
	
	%>
	
	<label>nome:</label>
	<input type="text" name="nome" value="<%= cursoAlterar.getNome() %>"required>
	<label>valor:</label>
	<input type="number" name="valor" step="0.01" value="<%= cursoAlterar.getValor() %>" required>
	<input type="hidden" name="id" value="<%= cursoAlterar.getId() %>"required>
	<input type="submit" value="Alterar">
	
	</form>
 
</body>
</html>