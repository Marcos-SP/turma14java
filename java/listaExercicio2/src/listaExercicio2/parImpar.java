package listaExercicio2;

import java.util.Scanner;

public class parImpar {
 public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);
	 	int valor;
		System.out.println("Digite um valor : ");
		valor = leia.nextInt();
		System.out.println(((valor % 2)==0 && valor>0)?"Valor é par e positivo":((valor % 2)==0 && valor<0)?"Valor é par negativo":((valor % 2)!=0 && valor>0)?"Valor é impar positivo":((valor % 2)!=0 && valor<0)?"Valor é impar negativo":"");
		
}
}
