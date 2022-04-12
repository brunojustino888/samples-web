package org.samplesweb.samples.jsf.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.samplesweb.samples.jsf.model.Cliente;
import org.samplesweb.samples.jsf.services.GestaoClientesService;

@SuppressWarnings("rawtypes")
@FacesConverter(forClass=Cliente.class)
public class ClienteConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		if(value!=null) { 
			GestaoClientesService service = new GestaoClientesService();
			return service.buscarPorCodigo(new Integer(value)); 
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object cliente) {
		if (cliente != null) {
			return ((Cliente) cliente).getCod().toString();
		}
		return null;
	}

}
