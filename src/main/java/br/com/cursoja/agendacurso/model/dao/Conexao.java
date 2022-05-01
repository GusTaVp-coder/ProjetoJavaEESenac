package br.com.cursoja.agendacurso.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	//ALTERAR BANCO DE DADOS 'teste' DA VARIAVEL CAMINHO//
	private String caminho = "jdbc:mysql://localhost:3306/cursoja";
	private String usuario = "root";
	private String senha = "";
	
	Connection conn = null;
	
	public Connection getConexao()
	{

		try
		{			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(caminho, usuario, senha);
			System.out.println("Conectado com sucesso.");
			
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Driver não encontrado.");
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao conectar ao banco de dados.");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void fecharConexao()
	{
		try
		{
			conn.close();
			System.out.println("Conexão fechada.");
		} 
		catch (SQLException e)
		{
			System.out.println("Erro ao fechar conexão.");
			e.printStackTrace();
		}
	}

}
