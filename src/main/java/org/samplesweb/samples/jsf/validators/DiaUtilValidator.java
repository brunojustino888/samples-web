package org.samplesweb.samples.jsf.validators;
import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@SuppressWarnings("rawtypes")
@FacesValidator("diaUtilValidator")
public class DiaUtilValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		Calendar data = Calendar.getInstance();
		data.setTime((Date) value);
		
		int diaDaSemana = data.get(Calendar.DAY_OF_WEEK);
		
		if (diaDaSemana == Calendar.SATURDAY || diaDaSemana == Calendar.SUNDAY) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Data não permitida.", "Informe uma data que seja dia útil.");
			throw new ValidatorException(msg);
		}
	}

}