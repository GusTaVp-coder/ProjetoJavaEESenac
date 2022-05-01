package br.com.cursoja.agendacurso.view;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.cursoja.agendacurso.controller.CursoController;
import br.com.cursoja.agendacurso.model.entidade.Curso;

/**
 * Servlet implementation class CursoExecutarAlterarServlet
 */
public class CursoExecutarAlterarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CursoExecutarAlterarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomeStr = request.getParameter("nome");
		String valorStr = request.getParameter("valor");
		String idStr = request.getParameter("id");
		
		long id = 0;
		double valor = 0;
		
		try
		{
			valor = Double.parseDouble(valorStr); 
		}
		catch (Exception e)
		{
			
		}
		
		try
		{
			id = Long.parseLong(idStr);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		Curso c = new Curso();
		c.setId(id);
		c.setNome(nomeStr);
		c.setValor(valor);
		
		CursoController controller = new CursoController();
		
		controller.alterar(c);
		
		RequestDispatcher rd = request.getRequestDispatcher("listarcurso.jsp");
		rd.forward(request, response);
	}

}
