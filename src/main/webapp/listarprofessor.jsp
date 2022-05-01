<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.cursoja.agendacurso.controller.ProfessorController" %>
<%@ page import="br.com.cursoja.agendacurso.model.entidade.Professor" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listagem de Professores</title>
</head>
<body>

	<form action="ProfessorBuscarServlet" method="get">
	
		<label>Filtrar Professores</label>
		<input type="text" name="nomeBusca" required>
		<input type="submit" value="Pesquisar">
		
	</form>

	<table>
	
		<thead>
			<th>Nome</th>
			<th>Celular</th>
			<th>Valor Hora Aula</th>
			<th>Ações</th>
		</thead>
		
		<tbody>
		
			<% ProfessorController controller = new ProfessorController();
			   ArrayList<Professor> lista = null;
			   
			   if(request.getAttribute("nomeBusca") == null)
			   {
			   		lista = controller.listar("");
			   }
			   else
			   {
				   lista = controller.listar( (String) request.getAttribute("nomeBusca"));
			   }
			   for(Professor p : lista)
			   {%>
		
			<tr>
				
				<td><%= p.getNome() %></td>
				<td><%= p.getCelular() %></td>
				<td><%= p.getValorHora() %></td>
				<td><a href="ProfessorAlterarServlet?id=<%= p.getId()%>">Alterar</a>
				    <a href="ProfessorExcluirServlet?id=<%= p.getId() %>" onClick="return confirm('Deseja excluir o professor <%= p.getNome() %>?')">Excluir</a></td>
			
			</tr>
			<% } %>
			
		</tbody>
	
	</table>

</body>
</html>