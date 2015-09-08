package controle;

import java.io.Serializable;

public class Pessoa implements Serializable{

	private Integer Id_Pessoa;
	private String nome_Pessoa;
	private String fone_Pessoa;
	private Boolean editando_Pessoa;
	
	
	public Pessoa(){
		
	}
	
	public Pessoa(Integer Id_Pessoa, String nome_Pessoa, String fone_Pessoa){
		
				 this.Id_Pessoa = Id_Pessoa;
				 this.nome_Pessoa = nome_Pessoa;
				 this.fone_Pessoa = fone_Pessoa;
				 
				 
				 
	}

	public Integer getId_Pessoa() {
		return Id_Pessoa;
	}

	public void setId_Pessoa(Integer id_Pessoa) {
		Id_Pessoa = id_Pessoa;
	}

	public String getNome_Pessoa() {
		return nome_Pessoa;
	}

	public void setNome_Pessoa(String nome_Pessoa) {
		this.nome_Pessoa = nome_Pessoa;
	}

	public String getFone_Pessoa() {
		return fone_Pessoa;
	}

	public void setFone_Pessoa(String fone_Pessoa) {
		this.fone_Pessoa = fone_Pessoa;
	}

	public Boolean getEditando_Pessoa() {
		return editando_Pessoa;
	}

	public void setEditando_Pessoa(Boolean editando_Pessoa) {
		this.editando_Pessoa = editando_Pessoa;
	}

}

	