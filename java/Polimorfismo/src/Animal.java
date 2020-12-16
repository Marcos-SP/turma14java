
public class Animal {
	//Atributos
	protected String nome;
	protected int idade;
	protected String som;
	//Contrutores
	public Animal(String nome, int idade, String som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}
	//Encapsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	//Métodos
	public String somAnimal(String som) {
		return this.som;
	}
	
}
