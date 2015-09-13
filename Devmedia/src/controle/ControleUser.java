package controle;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import model.User;

@ManagedBean(name = "controleUser")
@RequestScoped

public class ControleUser implements Serializable {

	public User user;

	public ControleUser() {

		user = new User();

	}
	
	public String recebeDados(){
		FacesMessage msg = new FacesMessage("Dados recebidos com sucesso.");
		FacesContext.getCurrentInstance().addMessage("", msg);
		return "formUser";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
