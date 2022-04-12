package org.samplesweb.samples.jsf.beans;


import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.samplesweb.samples.jsf.model.ItemEstoque;
import java.io.Serializable;
 

@Named
@ViewScoped
public class EstoqueBean implements Serializable { 
	
	private static final long serialVersionUID = 1L;
	private ItemEstoque itemEstoque = new ItemEstoque();
	private List<ItemEstoque> itensEstoque = new ArrayList<ItemEstoque>();
	
	public void incluir() {
		this.itensEstoque.add(this.itemEstoque);
		this.itemEstoque = new ItemEstoque();
	}

	public void limpar() {
		this.itensEstoque.clear();
	}
	
	public ItemEstoque getItemEstoque() {
		return itemEstoque;
	}

	public List<ItemEstoque> getItensEstoque() {
		return itensEstoque;
	}
	
}