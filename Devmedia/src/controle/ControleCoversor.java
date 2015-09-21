package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import conversores.ConverterCidades;

@ManagedBean(name ="controleCoversor")
public class ControleCoversor implements Serializable {

	private Calendar nascimento;
	private Cidade cidade;
	private List<Cidade> listaCidades = new ArrayList<Cidade>();
	private ConverterCidades converterCidade;

	public ControleCoversor() {
		nascimento = Calendar.getInstance();
		listaCidades.add(new Cidade(1, "Araripina", "PE"));
		listaCidades.add(new Cidade(2, "Recife", "PE"));
		listaCidades.add(new Cidade(3, "Trindade", "PE"));
		converterCidade = new ConverterCidades(listaCidades);
		
	}

	public String lerDados (){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		FacesMessage msg = new FacesMessage("Informe uma data Válida!");
		if (nascimento != null && cidade != null){
			msg = new FacesMessage(" Nascimento :"+sdf.format(nascimento.getTime())+
					" Cidade : "+cidade.getCidade() + " Uf : "+cidade.getUf());
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

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getListaCidades() {
		return listaCidades;
	}

	public void setListaCidades(List<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}

	public ConverterCidades getConverterCidade() {
		return converterCidade;
	}

	public void setConverterCidade(ConverterCidades converterCidade) {
		this.converterCidade = converterCidade;
	}

	

	

}
