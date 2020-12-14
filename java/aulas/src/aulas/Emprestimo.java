package aulas;

import java.util.Random;
import java.util.Scanner;

public class Emprestimo {
 public static void main(String[] args) {
	 char opcao;
	 double maximoEmprestimo[] = new double [40];
	 double emprestimo;
	 double saldoConta=0;
	 Scanner leia= new Scanner(System.in);
	 Random r= new Random();
	 for (int x=0;x<40;x++) {
		 maximoEmprestimo[x]=r.nextInt(9000)+1000;
		 System.out.println(maximoEmprestimo[x]);
	 }
	 
	 
	 do{
			
			System.out.println("\nVocê deseja realizar um empréstimo (S ou N)?");
			opcao= leia.next().charAt(0);
			while (opcao != 'S' && opcao!='N')
			{
				System.out.println("Valor inválido! Digite (S)-Sim ou (N)-Não ");
				opcao = leia.next().charAt(0);
			}
			if (maximoEmprestimo != 0){
				 if (opcao == 'S'){
				System.out.println("Quanto você quer de empréstimo: R$ ");
					emprestimo = leia.nextDouble();
					while (emprestimo < 0){
						System.out.println("\nValor inválido! Quanto você quer de empréstimo: R$ ");
						emprestimo = leia.nextDouble();				
					} 
					while (emprestimo >maximoEmprestimo)
					{
						System.out.println("\nValor inválido! Valor de empréstimo disponível: R$ " + maximoEmprestimo);
						System.out.println("\nQuanto você quer de empréstimo: R$ ");
						emprestimo = leia.nextDouble();	
						while (emprestimo<0){
							System.out.println("\nValor inválido! Quanto você quer de empréstimo: R$ ");
							emprestimo = leia.nextDouble();					
						} 
					}
					maximoEmprestimo=maximoEmprestimo-emprestimo;
					saldoConta=saldoConta+emprestimo;
				}
				 else
				{
					 System.out.println("\nSolicitação de crédito cancelada.");
				}
			}
			else{
				System.out.println("\nInfelizmente você não possui mais limite de empréstimo.")	;
			}
			 System.out.println("\n\nVocê tem "+saldoConta+" reais na sua conta do G6 Bank");
			 System.out.println("\nSeu limite disponível é: R$ "+maximoEmprestimo);
			 System.out.println("\nVocê deseja abrir o App G6 Bank hoje (S ou N)? ");
			 opcao = leia.next().toUpperCase().charAt(0);
			 
		}while(opcao =='S'); {
			 System.out.println("\n\nVocê tem "+saldoConta+" reais na sua conta do G6 Bank");
			 System.out.println("\nValor de empréstimo disponível: R$ ",maximoEmprestimo);
		
	 
		}

}

}
