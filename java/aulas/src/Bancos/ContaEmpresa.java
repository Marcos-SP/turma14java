package Bancos;

import java.util.Scanner;

public class ContaEmpresa extends Conta{
 private double emprestimoEmpresa;

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
//Metodos
public void emprestar(double valorEmprestimo)
{
	if(valorEmprestimo<=this.emprestimoEmpresa)
	{
		this.emprestimoEmpresa=this.emprestimoEmpresa-valorEmprestimo;
		this.saldo=this.saldo+valorEmprestimo;
		System.out.println("Valor de emprestimo disponivel:"+this.emprestimoEmpresa);
		System.out.println("Saldo Atual: "+this.saldo);
	}
	else 
	{
		System.out.println("ERRO.O seu limite é "+this.emprestimoEmpresa);
	}
	
	
}

 
}
