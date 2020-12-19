package loja;

public class Cliente extends Pessoa{
	protected String cpf;
	//construtor
	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);//Pois esta vindo de PESSOA
		this.cpf = cpf;
	}

	public Cliente(String nome, char genero, int anoNascimento) {
		super(nome, genero, anoNascimento);
	}

	//encapsu
	public String getCpf() {
		return cpf;
	}
	//metodo
	public void corrigeCPF (String cpf) {
		this.cpf = cpf;
		
	}
	

	
	
}
