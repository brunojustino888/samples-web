package org.samplesweb.samples.jsf.model;

import java.io.Serializable;

public class Produto implements Serializable{ 
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String categoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
		
}