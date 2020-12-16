package Bancos;

import java.util.Scanner;

public class ContaEmpresa extends Conta{
 private double emprestimoEmpresa;
 
 //Super = Super Classe, ele volta uma classe

 //Construtor
 public ContaEmpresa(int numeroConta, double emprestimoEmpresa) {
		super(numeroConta);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
 
 
 public ContaEmpresa(int numeroConta, String cpf, double emprestimoEmpresa) {
	super(numeroConta, cpf);
	this.emprestimoEmpresa = emprestimoEmpresa;
}


//Encapsulamento

public double getEmprestimoEmpresa() {
	return emprestimoEmpresa;
}



public void setEmprestimoEmpresa(double emprestimoEmpresa) {
	this.emprestimoEmpresa = emprestimoEmpresa;
}
//Metedo
public void pedirEmprestimo(double valor) {
	super.credito(valor);//Credito recebe valor
	this.emprestimoEmpresa -= valor;
}
@Override
public boolean testarSaldo(double valor) {
	boolean teste;
	if (valor <=super.getSaldo()) {
		teste = true;
	}
	else if(valor <= (this.emprestimoEmpresa+super.getSaldo())){
		Scanner l= new Scanner(System.in);
		System.out.println("Solicita emprestimo?Se sim digite valor, se nao digite 0");
		valor = l.nextDouble();
		double  valorCredito = valor - super.getSaldo();
		super.credito(valorCredito);
		this.emprestimoEmpresa=this.emprestimoEmpresa-valorCredito;
		teste = true;
	}
	else {
		teste = false;
	}
	return teste;
}
 
}
