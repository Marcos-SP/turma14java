package HerancaEncapsulameto;

public class Pessoa {
	//Atributos
	protected String nome;
	protected String endere�o;
	protected String telefone;
	//Construtores
	public Pessoa(String nome, String endere�o, String telefone) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}
	public Pessoa(String nome, String endere�o) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		
	}
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		
	}
	public Pessoa() {
		super();
	}
	//Encapsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
