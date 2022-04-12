package org.samplesweb.samples.jsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.samplesweb.samples.jsf.model.Cliente;

@Named
@ViewScoped
public class IndexBeanCliente implements Serializable{ 
	
	private static final long serialVersionUID = 1L;
	private List<Cliente> clienteLista = new ArrayList<Cliente>();
	
	public IndexBeanCliente() {
		this.clienteLista.add(new Cliente("Cliente ClientI",1,"Carapicuiba"));
		this.clienteLista.add(new Cliente("Cliente ClientII",2,"Osasco"));
		this.clienteLista.add(new Cliente("Cliente ClientIII",3,"Jabaquara"));
		this.clienteLista.add(new Cliente("Cliente ClientIV",4,"Barueri"));
		this.clienteLista.add(new Cliente("Cliente ClientV",5,"Carapicuiba"));
		this.clienteLista.add(new Cliente("Cliente ClientVI",6,"Osasco"));
	}
	
	public void excluir(Integer codCliente) {
		for(int i=0; i<this.clienteLista.size();i++) {
			if(codCliente == this.clienteLista.get(i).getCod()) {
				this.clienteLista.remove(i);
			}
		}
	}
	
	public void salvar(Integer codCliente) {
		for(int i=0; i<this.clienteLista.size();i++) {
			if(codCliente == this.clienteLista.get(i).getCod()) {
				System.out.println("Nome do cliente selecionado"+this.clienteLista.get(i).getNome());
				System.out.println("\nCidade do cliente selecionado"+this.clienteLista.get(i).getCidade());
				System.out.println("\nCodigo do cliente selecionado"+this.clienteLista.get(i).getCod());
			}
		}
	}
		
	public List<Cliente> getClienteLista() {
		return clienteLista;
	}	
		
}