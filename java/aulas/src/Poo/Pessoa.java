package Poo;

public class Pessoa {
	
	private String primeiroNome;
	private String meiosNome;
	private String ultimoNome;
	
	
	public Pessoa(String primeiroNome,String meiosNome, String ultimoNome) {
		this.primeiroNome=primeiroNome;
		this.meiosNome=meiosNome;
		this.ultimoNome= ultimoNome;
	}
	public String NomeCompleto() {
		String nomeCompleto = primeiroNome+meiosNome+ultimoNome;
		return nomeCompleto;
	}
}
