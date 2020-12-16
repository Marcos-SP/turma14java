package HerancaEncapsulameto;

public class Fornecedor extends Pessoa {
	//Atributos
	protected double valorCredito;
	protected double valorDivida;
	protected double saldo;
	//Construtores
	public Fornecedor(double valorCredito, double valorDivida) {
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
	public Fornecedor() {
		
		
	}
	
	
	
	//Encapsulamento
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}


	public double getSaldo() {
		return saldo;
	}


	
	
	//Métodos
	/*
	public void obterSaldo(double valorCredito,double valorDivida) {
		this.saldo=this.valorCredito-this.valorDivida;
		
	}
	*/
	public void Credito(double valorCredito) {
		this.saldo=this.saldo + valorCredito; //THIS.INDICA QUE O VALOR È DA CLASSE
		
	}
	public void divida(double valorDivida) {
		this.saldo=this.saldo - valorDivida; //THIS.INDICA QUE O VALOR È DA CLASSE
		
	}

	
	
	

}
