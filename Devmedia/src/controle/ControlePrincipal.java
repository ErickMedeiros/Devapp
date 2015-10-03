package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controlePrincipal")
@SessionScoped
public class ControlePrincipal implements Serializable {

	private String mensagem;
	
	public String home(){
		return "/index";
	}

	public ControlePrincipal() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
		mensagem = "A aplica��o foi ao ar no momento "
				+ sdf.format(Calendar.getInstance().getTime());

	}
	
	public String componentes5(){
		return "componentesParte5";
	}
	
	
	public String sobre() {
		mensagem = "Voc� foi redirecionado de maneira din�mica...";
		return "sobre";
	}

	public String sobreRedirecionado() {
		mensagem = "Voc� est� na p�gina de Sobre Redirecionado...";
		return "sobre?faces-redirect=true";
	}

	public String geraErro() {
		return "erro";
	}

	public String geraErroGrave() {
		return "erro";
	}

	public String geraLogin() {
		return "login";
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
