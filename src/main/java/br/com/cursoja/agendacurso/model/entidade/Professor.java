package br.com.cursoja.agendacurso.model.entidade;

public class Professor {
	
	private long id;
	private double valorHora;
	private String nome;
	private String celular;
	
	public long getId()
	{
		return id;
	}
	public double getValorHora()
	{
		return valorHora;
	}
	public String getNome()
	{
		return nome;
	}
	public String getCelular()
	{
		return celular;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public void setValorHora(double valorHora)
	{
		this.valorHora = valorHora;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setCelular(String celular)
	{
		this.celular = celular;
	}

}
