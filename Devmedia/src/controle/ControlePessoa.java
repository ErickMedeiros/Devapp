package controle;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "controlePessoa")
@SessionScoped
public class ControlePessoa implements Serializable {

	private Boolean opcaoSelecionada;
	private Boolean pessoaFisica;
	private Integer id;
	private String nome;
	private String cpf;
	private String cnpj;
	private String saida;

	public ControlePessoa() {
		opcaoSelecionada = false;
	}

	// Metódo Captura o estado de mudança de valor, Pessoa Física ou Jurídica,
	// ou seja,
	// submeter o formulário de forma automática
	// capturando o evento
	public void tipoChange(ValueChangeEvent e) {
		pessoaFisica = (Boolean) e.getNewValue();
		selecionar();

	}

	public String selecionar() {
		// metódo que seleciona o que o usuário vai fazer, escolher Pessoa
		// Física ou Jurídica
		opcaoSelecionada = true;
		String selecao = pessoaFisica == true ? "Pessoa Física"
				: "Pessoa Jurídica";
		FacesMessage msg = new FacesMessage("Tipo Selecionado:" + selecao);
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "formPessoa";
	}

	// metódo para exibir dados que vai retorna para o form Dados pessoas
	public String exibirDados() {
		saida = "";
		saida += "Valores recebidos:";
		saida += "<br/>"
				+ (pessoaFisica ? "Nome :" + nome : "Razão Social:" + nome);
		saida += "<br/>" + (pessoaFisica ? "CPF :" + cpf : "CNPJ:" + cnpj);
		FacesMessage msg = new FacesMessage("Dados Recebidos com Sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "dadosPessoa";

	}

	// Metódo para retornar a tela anterior para indersão de novos dados
	public String voltar() {
		opcaoSelecionada = false;
		id = null;
		nome = "";
		cpf = "";
		cnpj = "";
		// saida = "";

		return "formPessoa";

	}

	public Boolean getOpcaoSelecionada() {
		return opcaoSelecionada;
	}

	public void setOpcaoSelecionada(Boolean opcaoSelecionada) {
		this.opcaoSelecionada = opcaoSelecionada;
	}

	public Boolean getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(Boolean pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

}
