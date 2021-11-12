package br.org.generation.lojagames.model;

import java.time.LocalDate;

public class UsuarioLogin {

	private long id;
	
	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String Token;
	
	private LocalDate dataNascimento;

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}
	
	
	
}