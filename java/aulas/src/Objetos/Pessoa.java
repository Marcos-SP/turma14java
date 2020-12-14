package Objetos;

public class Pessoa {
	//Atributos
	public String nome;	//Toda pessoa tem nome
	public char genero; //Toda pessoa tem genero
	public int anoNascimento;//Toda pessoa tem ano de nascimento
	public int idade;
	
	public Pessoa() { //Quando Se tem um construtor é normal, acima de 1 ou seja 2,3... vira sobrecarga
		
	}
	public Pessoa(String nome)//Quando tem o nome da classe é um construtor, 
	{
		this.nome = nome;
	}
	
	public Pessoa(String nome, char genero, int anoNascimento ) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
		
	}
	//método
	public void retornaidade() {
		this.idade=2020-this.anoNascimento;
	}
	public void retornaidade(int anoAtual) {
		this.idade=anoAtual-this.anoNascimento;
	}
	
}
