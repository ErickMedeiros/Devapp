package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name ="controleCoversor")
public class ControleCoversor implements Serializable {

	private Calendar nascimento;

	public ControleCoversor() {
		nascimento = Calendar.getInstance();
	}

	public String lerDados (){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		FacesMessage msg = new FacesMessage("Informe uma data Válida!");
		if (nascimento != null){
			msg = new FacesMessage("Nascimento :"+sdf.format(nascimento.getTime()));
		} 
			FacesContext.getCurrentInstance().addMessage("", msg);
			nascimento = null;
		   return "formConversores";
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	

}
