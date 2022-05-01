package br.com.cursoja.agendacurso.model.entidade;

import java.util.Date;

public class Turma {
	
	private long id;
	private Date dataInicio;
	private Date dataFim;
	
	private Curso curso;
	private Professor professor;
	
	public long getId()
	{
		return id;
	}
	public Date getDataInicio()
	{
		return dataInicio;
	}
	public Date getDataFim()
	{
		return dataFim;
	}
	public Curso getCurso()
	{
		return curso;
	}
	public Professor getProfessor()
	{
		return professor;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public void setDataInicio(Date dataInicio)
	{
		this.dataInicio = dataInicio;
	}
	public void setDataFim(Date dataFim)
	{
		this.dataFim = dataFim;
	}
	public void setCurso(Curso curso)
	{
		this.curso = curso;
	}
	public void setProfessor(Professor professor)
	{
		this.professor = professor;
	}

}
