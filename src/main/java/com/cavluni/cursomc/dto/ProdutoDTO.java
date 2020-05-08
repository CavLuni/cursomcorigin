package com.cavluni.cursomc.dto;

import com.cavluni.cursomc.domain.Produto;

public class ProdutoDTO {

	private Integer id;
	private String nome;
	private Double preço;
	
	public ProdutoDTO() {
	}
	
	public ProdutoDTO (Produto obj) {
		id = obj.getId();
		nome = obj.getNome();
		preço = obj.getPreço();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	
}
