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

	@NotEmpty(message = "O nome deve ser obrigátório")
	@Length(min = 5, max = 40, message = "O nome dever ter no mínimo {min} e no máximo {max} caracteres.")
	private String nome;

	@NotEmpty(message = "A senha é obrigatória")
	@Length(min = 6, max = 10, message = "A senha deve ter entre {min} e {max} caracteres.")
	private String senha;

	@NotEmpty(message = "O CPF é obrigatório,")
	@CPF(message = "O CPF deve ser um número válido")
	private String cpf;

	@NotNull(message="A renda precisa ser preenchida")
	@Digits(fraction = 2, integer = 10, message = "A renda informada deve ter para para número inteiro no"
			+ "máximo {integer} e {fraction} para a parte fracionada.")
	private Double renda;

	@NotEmpty(message = "O email deve ser informado.")
	@Email(message = "O email deve ser um endereço válido")
	private String email;

	@NotEmpty(message = "O link de página deve ser informado")
	@URL(protocol = "http", message = "O link deve ser um endereço válido")
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
