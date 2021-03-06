package com.cavluni.cursomc.dto;

import java.io.Serializable;

import com.cavluni.cursomc.domain.Cidade;

public class CidadeDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer Id;
	private String nome;
	
	public CidadeDTO() {
	}

	public CidadeDTO(Cidade obj) {
		Id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
