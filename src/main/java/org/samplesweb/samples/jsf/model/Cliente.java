package org.samplesweb.samples.jsf.model;

import java.io.Serializable;

public class Cliente implements Serializable{ 
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cidade;
	private Integer cod;
	
	public Cliente(String nome, Integer cod, String cidade) {
		this.cidade = cidade;
		this.cod = cod;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Integer getCod() {
		return cod;
	}
	
	public void setCod(Integer cod) {
		this.cod = cod;
	}
		
}