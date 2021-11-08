package br.org.generation.lojagames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


	@Entity
	@Table(name = "tb_produtos")
	public class Produto 
	{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull (message = "Nome obrigatório")
		private String Nome;
		
		@Size (max = 255)
		private String Descricao;
		
		@NotNull (message = "Escolha entre Skin e Emote")
		private String Opcao;
		
		@JsonFormat(shape = JsonFormat.Shape.STRING) 
		@NotNull(message = "Por favor, digite um preço para o produto")
		@Positive(message = "O preço precisa ser um valor positivo!")
		private BigDecimal Preco;
		
		@NotNull(message = "Por favor, insira uma foto do produto")
		private String Foto;
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public String getDescricao() {
			return Descricao;
		}

		public void setDescricao(String descricao) {
			Descricao = descricao;
		}

		public String getOpcao() {
			return Opcao;
		}

		public void setOpcao(String opcao) {
			Opcao = opcao;
		}

		public BigDecimal getPreco() {
			return Preco;
		}

		public void setPreco(BigDecimal preco) {
			Preco = preco;
		}

		public String getFoto() {
			return Foto;
		}

		public void setFoto(String foto) {
			Foto = foto;
		}

	
		
		
	}
	

