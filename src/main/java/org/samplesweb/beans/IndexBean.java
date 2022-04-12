package org.samplesweb.beans;
 
import javax.annotation.PostConstruct; 
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named 
@ViewScoped
public class IndexBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	
	@PostConstruct
	public void init() {
		System.out.println("teste");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void acao() {
		System.out.println(this.nome);
	}
	
}