package controle;

import java.io.Serializable;

public class Cidade implements Serializable {

	private Integer id;
	private String cidade;
	private String uf;

	public Cidade() {

	}

	public Cidade(Integer id, String cidade, String uf) {
		this.id = id;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String toString() {
		return cidade;
	}

}
