package loja;

public abstract class Pessoa {
	// Atributos
	protected String nome;
	protected char genero;
	protected int anoNascimento;
	protected int idade;
	
	// Construtores
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}

	// Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	// Métodos
	public int voltaIdade(int anoNascimento) {
		
		return 2020 - this.anoNascimento;
		
	}
	
		
	
}
