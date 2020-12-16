package HerancaEncapsulameto;

public class Pessoa {
	//Atributos
	protected String nome;
	protected String enderešo;
	protected String telefone;
	//Construtores
	public Pessoa(String nome, String enderešo, String telefone) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}
	public Pessoa(String nome, String enderešo) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		
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
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
