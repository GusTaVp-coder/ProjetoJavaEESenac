<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.cursoja.agendacurso.model.entidade.Professor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar Professor</title>
</head>
<body>

	<% Professor professorAlterar = (Professor) request.getAttribute("professor"); %>

	<form action="ProfessorExecutarAlterarServlet" method="post">
	
	<label>nome:</label>
	<input type="text" name="nome" value="<%= professorAlterar.getNome() %>"required>
	<label>celular:</label>
	<input type="text" name="celular" value="<%= professorAlterar.getCelular() %>"required>
	<label>valor hora aula:</label>
	<input type="number" name="valor" step="0.01" value="<%= professorAlterar.getValorHora() %>"required>
	<input type="hidden" name="id" value="<%= professorAlterar.getId() %>">
	<input type="submit" value="Alterar">
	
	</form>
 
</body>
</html>