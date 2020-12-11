import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
 public static void main(String[] args) {
	Scanner leia= new Scanner(System.in);
	final int TAMANHO =3;
	int matriz[][]= new int [TAMANHO][TAMANHO];
	int linha, coluna;
	int totalNumeros=0, totalDiagonal=0;
	
	
	for(linha = 0; linha < TAMANHO; linha++) // aqui o giro das linhas
	{
		for (coluna = 0; coluna < TAMANHO; coluna++)  //aqui é o giro da coluna
		{
			//aqui é onde vc grava, apagar, mexer nos dados
			System.out.printf("Digite o valor da posição: ["+linha+"]["+coluna+"]");
			matriz[linha][coluna]= leia.nextInt();
			totalNumeros = totalNumeros + matriz[linha][coluna];
			if (linha == coluna)
			{
					//totalDiagonal = totalDiagonal + matriz[linha][coluna]
					totalDiagonal += matriz[linha][coluna];
					
			}	
		}
		System.out.println("\n");
	}
	System.out.println("\nMATRIZ ATUAL\n");
	for(linha = 0; linha < TAMANHO ; linha++)
	{
		for (coluna = 0; coluna < TAMANHO; coluna++)
		{
		System.out.printf(matriz[linha][coluna]+" ");
		}
		System.out.println();
	}
	System.out.printf("\nTotal de valores é:"+ totalNumeros);
	System.out.printf("\nTotal das diagonais é:"+ totalDiagonal);
}
}
