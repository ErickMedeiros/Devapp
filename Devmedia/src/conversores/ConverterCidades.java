package conversores;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import controle.Cidade;
public class ConverterCidades implements Converter {
	private List<Cidade> cidades;
	
	public ConverterCidades(List<Cidade> lista){
		this.cidades = lista;
		
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String string) {
		// TODO Auto-generated method stub
		Cidade retorno = null;
		for (Cidade c : cidades){
			if(c.getId().equals(Integer.parseInt(string))){
				retorno = c;
			}
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		// TODO Auto-generated method stub
		if (obj == null){
			return null;
		}
		Cidade retorno = (Cidade) obj;
		return retorno.getId().toString();
	}
	
	
	
}

