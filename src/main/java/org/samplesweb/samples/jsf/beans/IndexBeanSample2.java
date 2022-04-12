package org.samplesweb.samples.jsf.beans;

import java.io.Serializable;
import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named 
@ViewScoped
public class IndexBeanSample2 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String campoRadio;
	private boolean campoBooleanCheckBox;
	private String email;
	
	public void acao() {
		if(this.email==null || this.email.equals("") || (!this.email.contains("@")) ||
				(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)==Calendar.MONDAY)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Resumo do Error", "Detalhe do error"));
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Resumo do Fatal", "Detalhe do fatal"));
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Resumo do Info", "Detalhe do info"));
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Resumo do Warn", "Detalhe do warn"));
			FacesContext.getCurrentInstance().addMessage("frm:inputEmail", new FacesMessage(FacesMessage.SEVERITY_INFO,"Resumo do Info", "Detalhe do info"));
		}
	}
	
	public String acao1() {
		return "org.samplesweb.samples.jsf.beans.indexBeanSample2";
	}
	
	public String getCampoRadio() {
		return campoRadio;
	}

	public void setCampoRadio(String campoRadio) {
		this.campoRadio = campoRadio;
	}

	public boolean isCampoBooleanCheckBox() {
		return campoBooleanCheckBox;
	}

	public void setCampoBooleanCheckBox(boolean campoBooleanCheckBox) {
		this.campoBooleanCheckBox = campoBooleanCheckBox;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}