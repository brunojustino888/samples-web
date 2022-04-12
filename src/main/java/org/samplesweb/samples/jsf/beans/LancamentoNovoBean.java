package org.samplesweb.samples.jsf.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage; 
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.samplesweb.samples.jsf.enums.TipoLancamento;
import org.samplesweb.samples.jsf.model.Cliente;
import org.samplesweb.samples.jsf.model.Lancamento;
import org.samplesweb.samples.jsf.services.GestaoClientesService;
 
@Named
@ViewScoped
public class LancamentoNovoBean implements Serializable { 
	
	private static final long serialVersionUID = 1L;
	private Lancamento lancamento = new Lancamento();
	private List<Cliente> listaClientes;
	
	@PostConstruct
	public void init() {
		this.preencherComboClientes();
	}
	
	public void cadastrar() {
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro realizado com sucesso!", "Cadastro realizado com sucesso!"));
		System.out.println("Tipo: " + this.lancamento.getTipo());
		System.out.println("Cliente: " + this.lancamento.getPessoa().getNome());
		System.out.println("Descrição: " + this.lancamento.getDescricao());
		System.out.println("Valor: " + this.lancamento.getValor());
		System.out.println("Data vencimento: " + this.lancamento.getDataVencimento());
		System.out.println("Conta paga: " + this.lancamento.isPago());
		System.out.println("Data pagamento: " + this.lancamento.getDataPagamento());
		this.lancamento = new Lancamento();
	}

	private void preencherComboClientes() {
		GestaoClientesService serviceClientes = new GestaoClientesService();
		this.listaClientes = serviceClientes.buscarClientes();
	}
			
	public TipoLancamento[] getTiposLancamentos() {
		return TipoLancamento.values();
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
}