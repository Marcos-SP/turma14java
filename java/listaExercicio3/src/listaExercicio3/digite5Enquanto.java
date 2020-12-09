package listaExercicio3;

import java.util.Scanner;

public class digite5Enquanto {
	public static void main(String[] args) {
		int i, num;
		i = 1;
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite um numero = ");
			num = leia.nextInt();
		}

		while (i <= 100) {
			System.out.printf("\n %d", num*3);
			num = num * 3;
			i++;
		}
	}
}
