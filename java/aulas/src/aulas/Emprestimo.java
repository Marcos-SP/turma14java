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
			
			System.out.println("\nVoc� deseja realizar um empr�stimo (S ou N)?");
			opcao= leia.next().charAt(0);
			while (opcao != 'S' && opcao!='N')
			{
				System.out.println("Valor inv�lido! Digite (S)-Sim ou (N)-N�o ");
				opcao = leia.next().charAt(0);
			}
			if (maximoEmprestimo != 0){
				 if (opcao == 'S'){
				System.out.println("Quanto voc� quer de empr�stimo: R$ ");
					emprestimo = leia.nextDouble();
					while (emprestimo < 0){
						System.out.println("\nValor inv�lido! Quanto voc� quer de empr�stimo: R$ ");
						emprestimo = leia.nextDouble();				
					} 
					while (emprestimo >maximoEmprestimo)
					{
						System.out.println("\nValor inv�lido! Valor de empr�stimo dispon�vel: R$ " + maximoEmprestimo);
						System.out.println("\nQuanto voc� quer de empr�stimo: R$ ");
						emprestimo = leia.nextDouble();	
						while (emprestimo<0){
							System.out.println("\nValor inv�lido! Quanto voc� quer de empr�stimo: R$ ");
							emprestimo = leia.nextDouble();					
						} 
					}
					maximoEmprestimo=maximoEmprestimo-emprestimo;
					saldoConta=saldoConta+emprestimo;
				}
				 else
				{
					 System.out.println("\nSolicita��o de cr�dito cancelada.");
				}
			}
			else{
				System.out.println("\nInfelizmente voc� n�o possui mais limite de empr�stimo.")	;
			}
			 System.out.println("\n\nVoc� tem "+saldoConta+" reais na sua conta do G6 Bank");
			 System.out.println("\nSeu limite dispon�vel �: R$ "+maximoEmprestimo);
			 System.out.println("\nVoc� deseja abrir o App G6 Bank hoje (S ou N)? ");
			 opcao = leia.next().toUpperCase().charAt(0);
			 
		}while(opcao =='S'); {
			 System.out.println("\n\nVoc� tem "+saldoConta+" reais na sua conta do G6 Bank");
			 System.out.println("\nValor de empr�stimo dispon�vel: R$ ",maximoEmprestimo);
		
	 
		}

}

}
