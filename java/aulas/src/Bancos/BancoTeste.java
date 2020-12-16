package Bancos;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int conta;
		char op;
		double valor = 0;
		System.out.println("Banco teste para uso");
		
		System.out.println("Digite o numero da conta: ");
		conta = leia.nextInt();
		//ContaPoupanca edpop = new ContaPoupanca();
		ContaCorrente contaPobre = new ContaCorrente();
		//ContaEspecial contaRico = new ContaEspecial();
		ContaUniversitaria contaFF= new ContaUniversitaria();
		Conta teste = new ContaUniversitaria();//Isso pode
		//Conta teste1 = new Conta(); //Isso não pode 
		
	
		contaPobre.credito(100);
		//contaRico.valorLimite = 10000;
		contaPobre.cpf="222323";
		
		contaFF.credito (100000);
		System.out.println(contaFF.getSaldo());
		
		//System.out.println(contaFF.saldo); Não funcina mais pois não é mais publica
		Conta processo1 = new ContaUniversitaria();
		System.out.println("Saldo atual da conta é"+contaFF.getSaldo());
		System.out.println("Deseja movimentar?");
		op = leia.next().toUpperCase().charAt(0);
		while (op =='S') {
			System.out.println("Movimenro a [C]credito ou [D]debito");
			op = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o valor : ");
			valor = leia.nextDouble();
			if (op == 'D') {
				processo1.debito(valor);
			}
			else if(op=='C') {
				processo1.credito(valor);
			}
			System.out.println(contaFF.getSaldo());
			System.out.println("Deseja continuar S/N");
		
			op = leia.next().toUpperCase().charAt(0); 
		}
		System.out.println("Fim do programa, Obrigado");
		System.out.println(contaFF.getSaldo());
	}

}
