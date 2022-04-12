package org.samplesweb.samples.jsf.beans;
 
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.samplesweb.samples.jsf.model.Produto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named 
@SessionScoped
public class IndexBeanSample implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nomeDaPesquisa;
	private final String nomeIndexBean2 = "Classe java: org.samplesweb.samples.jsf.beans.IndexBeanSample.java";
	private final String nomeIndexBeanI2 = "Arquivo xhtml: indexSample2.xhtml";
	private String inputComboSelecionado;
	private Produto produto;
	private Produto produtoSelecionado;
	private List<Produto> listaProdutos;
	private List<Produto> listaProdutosFiltrados;
	
	public IndexBeanSample() {
		System.out.println("CONSTRUTOR INICIALIZADO");
		this.produto = new Produto();
		this.listaProdutos = new ArrayList<Produto>();
		System.out.println("CONSTRUTOR FINALIZADO");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("POST CONSTRUCTOR INICIALIZADO");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("POST CONSTRUCTOR FINALIZADO");
	}
	
	public void acao() {
		this.listaProdutos.add(this.produto);
		if("".equals(this.produto.getCategoria())){
			this.produto.setCategoria("Categoria nao inclusa");
		}
		this.produto = new Produto();
		System.out.println("Quantidade de itens na lista: "+this.listaProdutos.size()+".");
	}
	
	public void verificaAcaoListener() {
		System.out.println("ActionListener:");
		System.out.println("Quantidade de itens na lista: "+this.listaProdutos.size()+".");
	}
	
	public void excluir() {
		this.listaProdutos.remove(this.produtoSelecionado);
	}
	
	public void pesquisar() {
		System.out.println(this.nomeDaPesquisa);
		this.listaProdutosFiltrados = new ArrayList<Produto>();
		for(Produto aux: this.listaProdutos) {
			if(aux.getNome().toLowerCase().startsWith(this.nomeDaPesquisa.toLowerCase())){
				this.listaProdutosFiltrados.add(aux);
			}
		}		
	}

	public void mostrarItemCombo() {
		System.out.println("Item selecionado da pagina indexSample2.xhtml : " + this.inputComboSelecionado);
	}
	
	public Produto getProduto() {
		return this.produto;
	}
		
	public List<Produto> getListaProdutosFiltrados() {
		return listaProdutosFiltrados;
	}

	public void setListaProdutosFiltrados(List<Produto> listaProdutosFiltrados) {
		this.listaProdutosFiltrados = listaProdutosFiltrados;
	}

	public List<Produto> getListaProdutos(){
		return this.listaProdutos;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public String getNomeDaPesquisa() {
		return nomeDaPesquisa;
	}

	public void setNomeDaPesquisa(String nomeDaPesquisa) {
		this.nomeDaPesquisa = nomeDaPesquisa;
	}

	public String getNomeIndexBean2() {
		return nomeIndexBean2;
	}

	public String getNomeIndexBeanI2() {
		return nomeIndexBeanI2;
	}

	public String getInputComboSelecionado() {
		return inputComboSelecionado;
	}

	public void setInputComboSelecionado(String inputComboSelecionado) {
		this.inputComboSelecionado = inputComboSelecionado;
	}

}