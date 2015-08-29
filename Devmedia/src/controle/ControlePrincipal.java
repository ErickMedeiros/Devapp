package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controlePrincipal")
@RequestScoped

public class ControlePrincipal implements Serializable {
	
	private String mensagem;

	public ControlePrincipal (){
		
		mensagem = "Nova Mensagem";
		
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
