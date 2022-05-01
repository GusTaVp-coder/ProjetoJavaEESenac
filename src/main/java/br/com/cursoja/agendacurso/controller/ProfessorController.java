package br.com.cursoja.agendacurso.controller;

import java.util.ArrayList;

import br.com.cursoja.agendacurso.model.dao.ProfessorDao;
import br.com.cursoja.agendacurso.model.entidade.Professor;

public class ProfessorController {
	
	ProfessorDao dao = new ProfessorDao();
	
	public void cadastrar(Professor p)
	{
		dao.cadastar(p);
	}
	public void alterar(Professor p)
	{
		dao.alterar(p);
	}
	public ArrayList<Professor> listar(String nomeBusca)
	{
		return dao.listar(nomeBusca);
	}
	public Professor buscar(long id)
	{
		return dao.buscar(id);
	}
	public void excluir(Professor p)
	{
		dao.excluir(p);
	}

}
