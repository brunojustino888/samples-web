package org.samplesweb.samples.jsf.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.samplesweb.samples.jsf.model.Cliente;
 

public class GestaoClientesService {

	private static Map<Integer, Cliente> clientesMap = new HashMap<Integer, Cliente>();
	
	static {
		clientesMap.put(1, new Cliente("João da Silva",1,"Osasco"));
		clientesMap.put(2, new Cliente("Lava-jato Água e Sabão Ltda",2,"Barueri"));
		clientesMap.put(3, new Cliente("Sebastião Mendes de Souza",3,"Carapicuiba"));
	}
	
	public List<Cliente> buscarClientes() {
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes.addAll(GestaoClientesService.clientesMap.values());
		return listaClientes;
	}
	
	public Cliente buscarPorCodigo(Integer codigo) {
		return clientesMap.get(codigo);
	}
	
}