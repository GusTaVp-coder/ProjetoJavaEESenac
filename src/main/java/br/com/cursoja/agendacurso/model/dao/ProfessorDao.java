package br.com.cursoja.agendacurso.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import br.com.cursoja.agendacurso.model.entidade.Professor;

public class ProfessorDao extends Conexao{

	// I N S E R T S //
	public void cadastar(Professor p)
	{
		String sql = "insert into professor (nome, celular, valorhora) values(?, ?, ?)";
		
		try
		{
		PreparedStatement ps = getConexao().prepareStatement(sql);
		
		ps.setString(1, p.getNome());
		ps.setString(2, p.getCelular());
		ps.setDouble(3, p.getValorHora());
		ps.execute();
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao cadastrar professor.");
			e.printStackTrace();
		}
		finally
		{
			fecharConexao();
		}
	}
	
	// U P D A T E S //
	public void alterar(Professor p) 
	{
		String sql = "update professor set nome = ?, celular = ?, valorhora = ? where idprofessor = ?";
		
		try
		{
			PreparedStatement ps = getConexao().prepareStatement(sql);
			
			ps.setString(1, p.getNome());
			ps.setString(2, p.getCelular());
			ps.setDouble(3, p.getValorHora());
			ps.setLong(4, p.getId());
			ps.execute();
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao alterar professor.");
			e.printStackTrace();
		}
		finally
		{
			fecharConexao();
		}		
	}
	
	// S E L E C T S //
	public ArrayList<Professor> listar (String nomeBusca)
	{
		ArrayList<Professor> lista = new ArrayList<Professor>();
		
		String sql = "select * from professor where nome like ? order by nome";
		
		try
		{
			PreparedStatement ps = getConexao().prepareStatement(sql);
			
			ps.setString(1, "%" + nomeBusca + "%");
			
			ResultSet rs = ps.executeQuery();
			Professor p;
			while(rs.next())
			{
				p = new Professor();
				p.setId(rs.getLong("idprofessor"));
				p.setNome(rs.getString("nome"));
				p.setCelular(rs.getString("celular"));
				p.setValorHora(rs.getDouble("valorhora"));
				
				lista.add(p);
			}
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao buscar professores.");
			e.printStackTrace();
		}
		finally
		{
			fecharConexao();
		}
		
		return lista;
	}
	
	public Professor buscar(long id)
	{
		Professor professor = null;
		String sql = "select * from professor where idprofessor = ?";
		
		try
		{
			PreparedStatement ps = getConexao().prepareStatement(sql);
			
			ps.setLong(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				professor = new Professor();
				professor.setId(rs.getLong("idprofessor"));
				professor.setNome(rs.getString("nome"));
				professor.setCelular(rs.getString("celular"));
				professor.setValorHora(rs.getDouble("valorhora"));
			}
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao buscar professor pro id.");
			e.printStackTrace();
		}
		finally
		{
			fecharConexao();
		}
		
		return professor;
	}
	
	
	// D E L E T E S //
	public void excluir(Professor p)
	{
		String sql = "delete from professor where idprofessor = ?";
		
		try
		{
			PreparedStatement ps = getConexao().prepareStatement(sql);
			
			ps.setLong(1, p.getId());
			ps.execute();
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao deletar professor.");
			e.printStackTrace();
		}
		finally
		{
			fecharConexao();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
