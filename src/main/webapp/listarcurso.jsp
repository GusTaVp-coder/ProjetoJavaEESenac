<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.cursoja.agendacurso.controller.CursoController" %>
<%@ page import="br.com.cursoja.agendacurso.model.entidade.Curso" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listagem de Cursos</title>
</head>
<body>

	<form action="CursoBuscarServlet" method="get">
	
		<label>Filtrar Cursos</label>
		<input type="text" name="nomeBusca" required>
		<input type="submit" value="Pesquisar">
		
	</form>

	<table>
	
		<thead>
				<th>Nome</th>
				<th>Valor</th>
				<th>Ações</th>
		</thead>
	
		<tbody>
		
				<% CursoController controller = new CursoController();
				   ArrayList<Curso> lista = null;				   
				   DecimalFormat fmt = new DecimalFormat("###0.00");
				   
				   if(request.getAttribute("nomeBusca") == null)
				   {
					   lista = controller.listar("");
				   }
				   else
				   {
					   lista = controller.listar( (String)request.getAttribute("nomeBusca"));
				   }
				   
				   for(Curso c : lista)
				   {
				    %>
				<tr>
					<td><%= c.getNome() %></td>
					<td><%= fmt.format(c.getValor()) %></td>
					<td>
						<a href="CursoAlterarServlet?id=<%= c.getId() %>">Alterar</a>
						<a href="CursoExcluirServlet?id=<%= c.getId() %>" onClick="return confirm('Deseja exlcuir o curso <%= c.getNome() %>?')">Excluir</a>
					
					</td>
					
				</tr>
				<% } %>
		</tbody>
	
	</table>

</body>
</html>