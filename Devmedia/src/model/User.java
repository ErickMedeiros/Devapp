package model;

import java.io.Serializable;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.br.CPF;

public class User implements Serializable {

	@NotEmpty(message = "O nome deve ser obrig�t�rio")
	@Length(min = 5, max = 40, message = "O nome dever ter no m�nimo {min} e no m�ximo {max} caracteres.")
	private String nome;

	@NotEmpty(message = "A senha � obrigat�ria")
	@Length(min = 6, max = 10, message = "A senha deve ter entre {min} e {max} caracteres.")
	private String senha;

	@NotEmpty(message = "O CPF � obrigat�rio,")
	@CPF(message = "O CPF deve ser um n�mero v�lido")
	private String cpf;

	@NotNull(message="A renda precisa ser preenchida")
	@Digits(fraction = 2, integer = 10, message = "A renda informada deve ter para para n�mero inteiro no"
			+ "m�ximo {integer} e {fraction} para a parte fracionada.")
	private Double renda;

	@NotEmpty(message = "O email deve ser informado.")
	@Email(message = "O email deve ser um endere�o v�lido")
	private String email;

	@NotEmpty(message = "O link de p�gina deve ser informado")
	@URL(protocol = "http", message = "O link deve ser um endere�o v�lido")
	private String pagina;

	public User() {

		this.nome = "";
		this.senha = "";
		this.cpf = "";
		this.renda = null;
		this.email = "";
		this.pagina = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

}
