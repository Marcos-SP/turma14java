package listaExercicio2;

import java.util.Scanner;

public class numeroQuadrado {
	public static void main(String[] args) {	 
		Scanner leia = new Scanner(System.in);
		int a, b , c, d;
	System.out.println("Entre com valor A :");
	a = leia.nextInt();
	System.out.println("Entre com valor B :");
	b = leia.nextInt();
	System.out.println("Entre com valor C :");
	c = leia.nextInt();
	System.out.println("Entre com valor D :");
	d = leia.nextInt();
	a = (int) Math.pow(a, 2);
	b = (int) Math.pow(b, 2);
	c = (int) Math.pow(c, 2);
	d = (int) Math.pow(d, 2);
	if(c>=1000) {
		System.out.printf("\nValor C : %d",c);
			
		}
	else {
		System.out.printf("\nValor A : %d",a);
		System.out.printf("\nValor B : %d",b);
		System.out.printf("\nValor C : %d",c);
		System.out.printf("\nValor D : %d",d);
	}
	
}
}
