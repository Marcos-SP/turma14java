package listaExercicio2;

import java.util.Scanner;

public class triangulo {
 public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);
	 int base, altura, area;
	 System.out.println("Digite o numero da base: ");
	 base = leia.nextInt();
	 System.out.println("Digite o numero da altura: ");
	 altura = leia.nextInt();
	 if(base>0 && altura>0) {
		 area=base*altura/2;
		 System.out.printf("A area do triangulo é %d", area);
		 
	 }
	 else {
		 System.out.printf("Valores invalidos");
	 }
}
}
