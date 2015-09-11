package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




@ManagedBean (name ="controleTabela")
@SessionScoped
public class ControleTabela implements Serializable {

	private List<Pessoa> lista;
	
	public ControleTabela(){
		lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa(1, "Erick Medeiros", "87-99183-2022"));
		lista.add(new Pessoa(2, "Romeu Medeiros", "87-98893-2022"));
		lista.add(new Pessoa(3, "Maria Medeiros", "81-99383-2290"));
		lista.add(new Pessoa(4, "Lilian Medeiros", "87-99183-2902"));
		lista.add(new Pessoa(5, "Erick Medeiros", "87-99183-2022"));
		lista.add(new Pessoa(6, "Romeu Medeiros", "87-98893-2022"));
		lista.add(new Pessoa(7, "Maria Medeiros", "81-99383-2290"));
		lista.add(new Pessoa(8, "Lilian Medeiros", "87-99183-2902"));
	}
	
	public String salvar(){
		for (Pessoa obj : lista)obj.setEditando_Pessoa(false);
		return null;
	}
	
	public String excluir(Pessoa obj){
		lista.remove(obj);
		return null;
	}
	
	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
	
	
}
