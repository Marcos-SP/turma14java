package listaExercicio2;

import java.util.Scanner;

public class variavelNumericaN {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	 int n;
	 System.out.println("Digite o numero da base: ");
	 n = leia.nextInt();
	 if (n>=100) {
		 System.out.printf("Valor de N: %d", n);
	 }
	 else {
		 n= 0;
		 System.out.printf("Valor de N: %d", n);		 
	 }
}
}
