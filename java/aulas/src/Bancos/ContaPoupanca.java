package Bancos;

public class ContaPoupanca extends Conta{
//Atributos
	private int dataAniversarioConta;
	//Constru

	public ContaPoupanca(int numeroConta, int dataAniversarioConta) {
	super(numeroConta);
	this.dataAniversarioConta = dataAniversarioConta;
}

	public ContaPoupanca(int numeroConta, String cpf, int dataAniversarioConta) {
	super(numeroConta, cpf);
	this.dataAniversarioConta = dataAniversarioConta;
}
  //Encam
	public int getDataAniversarioConta() {
		return dataAniversarioConta;
	}

	public void setDataAniversarioConta(int dataAniversarioConta) {
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
}
