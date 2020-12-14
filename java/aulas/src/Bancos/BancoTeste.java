package Bancos;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int conta;
		System.out.println("Banco teste para uso");
		//Conta cliente1= new Conta(100);
		System.out.println("Digite o numero da conta: ");
		conta = leia.nextInt();
		Conta Processo1 = new Conta(conta);
		System.out.println("Digite o numero da conta: ");
		conta = leia.nextInt();
		Conta Processo2 = new Conta(conta);
		System.out.println("Conta 1"+Processo1.numeroConta+"Conta 2-"+Processo2.numeroConta);
		conta=0;
	}

}
