package model;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Pessoa implements Serializable{
	
	private Integer id_pes;
	@NotEmpty(message="O nome deve ser informado")
	@Length(max=40, message="O nome não pode ter mais que {max} caracteres")
	private String nome;
	@Email(message="Informe um email valido")
	private String email;
	
	public Pessoa(){
		
	}

	public Integer getId_pes() {
		return id_pes;
	}

	public void setId_pes(Integer id_pes) {
		this.id_pes = id_pes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
