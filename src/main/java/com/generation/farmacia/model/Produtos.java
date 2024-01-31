package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O nome é obrigatorio.")
	@Size(min = 2, max = 100, message = "O atributo tipo deve conter no mínimo 02 e no máximo 100 caracteres")
	private String nome;

	@NotNull(message = "O Atributo Preço é obrigatório")
	private Double preco;

	@Size(min = 5, max = 100, message = "O Atributo Indicação deve ter no mínimo 5 caracteres e no máximo 100")
	@NotBlank(message = "Atributo Indicação é obrigatório")
	private String indicacao;

	@Size(min = 5, max = 100, message = "O Atributo Composição deve ter no mínimo 5 caracteres e no máximo 100")
	@NotBlank(message = "Atributo Composição é obrigatório")
	private String composicao;

	@Size(min = 5, max = 100, message = "O Atributo Posologia deve ter no mínimo 5 caracteres e no máximo 100")
	@NotBlank(message = "Atributo Posologia é obrigatório")
	private String posologia;

	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public String getComposicao() {
		return composicao;
	}

	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}

	public String getPosologia() {
		return posologia;
	}

	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}


	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}