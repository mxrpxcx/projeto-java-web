package com.godoy.cadastroestudantes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class GenericDAO {
	static String jdbcURL = "jdbc:mysql://localhost:3306/dbColegio?useSSL=false";
	static String jdbcUsuario = "root";
	static String jdbcSenha = "root";
	
	public Connection abrirConexao() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(jdbcURL, jdbcUsuario, jdbcSenha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
