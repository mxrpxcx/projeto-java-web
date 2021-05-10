package com.godoy.cadastroestudantes.model;

public class UsuarioBean {
	private int idUsuario;
	private String nome;
	private String email;
	private String paisDeOrigem;
	
	public UsuarioBean() {
		
	}
	
	public UsuarioBean(String nome, String email, String paisDeOrigem) {
		super();
		this.nome = nome;
		this.email = email;
		this.paisDeOrigem = paisDeOrigem;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}
	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}
	
	
	
}
