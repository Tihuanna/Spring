package br.org.generation.lojagames.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O nome não pode ser nulo")
	@Size(min = 2, max = 100, message = "tamanho de nome inválido")
	private String nome;
	
	@Column(name = "Data_nascimento")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "O atributo data de nascimento é obrigatório")
	private LocalDate dataNascimento;
	
	@NotNull(message = "O usuário não pode ficar em branco")
	@Email(message = "O email é inválido")
	private String usuario;
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@NotBlank(message = "É necessário uma senha")
	@Size(min = 8,max = 100, message = "Senha precisa ter no minimo 8 caracteres")
	private String senha;

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
	
	
}