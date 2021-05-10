package com.godoy.cadastroestudantes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.godoy.cadastroestudantes.model.UsuarioBean;

public class UsuarioDAO extends GenericDAO {

	private static final String INSERIR_USUARIO = "INSERT INTO tbUsuario " + "(nome, email, paisDeOrigem) VALUES " +
	"(?, ?, ?);";
	
	private static final String SELECIONAR_USUARIO = "SELECT * FROM tbUsuario;";
	
	private static final String DELETAR_USUARIO = "DELETE FROM tbUsuario WHERE idUsuario = ?;";
	
	private static final String ATUALIZAR_USUARIO = "UPDATE tbUsuario SET nome=?, email=?, paisDeOrigem=? WHERE "
			+ "idUsuario = ?;";
	
	private static final String SELECIONAR_USUARIO_ID = "SELECT * FROM tbUsuario WHERE idUsuario = ?;";
	
	public void inserirUsuario(UsuarioBean u) {
		try(Connection conn = abrirConexao();
			PreparedStatement pstm = conn.prepareStatement(INSERIR_USUARIO)){
			
			pstm.setString(1, u.getNome());
			pstm.setString(2, u.getEmail());
			pstm.setString(3, u.getPaisDeOrigem());
			pstm.executeUpdate();
		
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}


}
