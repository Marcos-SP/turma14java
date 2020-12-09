package listaExercicio3;

import java.util.Scanner;

public class cidadeIntegrantes {
	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		final int populacao=5;
		int numeroFilhos,somaFilhos=0, salario,somaSalario=0,mediaSalario=0;
		int salario100=0, mediaFilhos=0;
		for(int x = 1; x < populacao ; x++)
		{
			System.out.println("Entre com o salario : ");
			salario = leia.nextInt();
			System.out.println("Numero de filhos: ");
			numeroFilhos = leia.nextInt();
			somaSalario=somaSalario+salario;
			somaFilhos=somaFilhos+somaSalario;
			if(somaSalario<salario) {
				somaSalario=salario;
			}
			else if(salario100<=100) {
				salario100++;
			}	
		}
		mediaSalario=somaSalario/populacao;
		mediaFilhos=somaFilhos/populacao;
		System.out.printf("\nMédia dos salalrios : %d", mediaSalario);
		System.out.printf("\nMédia Filhos: %d", somaFilhos/populacao);
		System.out.printf("\nMaior salario: %d", somaSalario);
		System.out.printf("\nPercentual de pessoas com salario até R$100: %d", somaSalario);
			
		
	
	}
}
