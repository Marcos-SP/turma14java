package Bancos;

public abstract  class Conta { //Abstract pois generaliza, e outro programador n�o pode mudar, ex: Conta 1= new conta(); n�o pode, vai precisar puxar um tipo conta
	//ATRIBUTOS
	//� OU TEM 
	protected int numeroConta; //Private trava na classe
	protected double saldo;		//Protected Trava nas subclassess
	protected String cpf;//tem				//Melhor tudo Private
	
	
	//Construtores, pedreiro e pe�o
	/*public Conta() //Construtor padr�o	n�o pode ser aberta sem no minimo numero conta
	{
		
	}
	*/
	public Conta (int numeroConta)//SObrecarga- mesma coisa de um jeito diferente
	
	{
		this.numeroConta = numeroConta;
		 
	}
	public Conta(int numeroConta, String cpf) //Sobrecarga tamb�m
	{
		this.numeroConta=numeroConta;
		this.cpf=cpf;
	}
	
	//Encapsulamento
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		public double getSaldo() {				//N�o pode mais mexer no saldo
			return saldo;
		}												
		
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
	//METODO
						//PARAMETRO ENTRADA
	public void debito (double valorDebito) {
		if(testarSaldo(valorDebito)) {
			this.saldo=this.saldo - valorDebito; //THIS.INDICA QUE O VALOR � DA CLASSE
		}else {
			System.out.println("Saldo Indiponivel");
		}
		
		
	}
	public void credito (double valorCredito) {
		this.saldo=this.saldo + valorCredito; //THIS.INDICA QUE O VALOR � DA CLASSE
		
	}
	public void pixDebito(double ValorDebitoPix) {
		this.saldo=this.saldo - ValorDebitoPix;
	}
	public void pixCredito(double ValorCreditoPix) {
		this.saldo=this.saldo - ValorCreditoPix;
	}
	public boolean testarSaldo(double valor) {
		boolean teste;
		if (valor <=this.saldo) {
			teste = true;
		}
		else {
			teste = false;
		}
		return teste;
	}
	
	
	
	
	
	
}
