package listaExercicio3;

import java.util.Scanner;

public class Seteate28 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = 0, resultado = 0;
		
		System.out.println("Digite o numero: \n");
		numero = leia.nextInt();

		do {

			resultado = resultado + numero;
			numero = numero - 1;

		} while (numero >= 0);
		System.out.printf("%d", resultado);
	}
}
