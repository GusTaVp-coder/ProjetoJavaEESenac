package br.com.cursoja.agendacurso.controller;

import java.util.ArrayList;

import br.com.cursoja.agendacurso.model.dao.CursoDao;
import br.com.cursoja.agendacurso.model.entidade.Curso;

public class CursoController {
	
	CursoDao dao = new CursoDao();
	
	public void cadastrar(Curso c)
	{
		dao.cadastrar(c);
	}
	public void alterar(Curso c)
	{
		dao.alterar(c);
	}
	public ArrayList<Curso> listar(String nomeBusca)
	{
		return dao.listar(nomeBusca);
	}
	public Curso buscar(long id)
	{
		return dao.buscar(id);
	}
	public void excluir(Curso c)
	{
		dao.excluir(c);
	}

}
