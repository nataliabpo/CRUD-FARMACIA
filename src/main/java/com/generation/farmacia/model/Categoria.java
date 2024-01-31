package com.generation.farmacia.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")

public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O nome é obrigatorio.")
	@Size(min = 2, max = 100, message = "O atributo tipo deve conter no mínimo 05 e no máximo 100 caracteres")
	private String nome;
	
	@NotNull(message = "A descrição é obrigatorio.")
	@Size(min = 10, max = 100, message = "O atributo tipo deve conter no mínimo 05 e no máximo 100 caracteres")
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="categoria", cascade=CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produtos> produtos;

	public List<Produtos> getProdutos() {
		return produtos;
	}
	public void setCategoria(List<Produtos> produtos) {
		this.produtos = produtos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
