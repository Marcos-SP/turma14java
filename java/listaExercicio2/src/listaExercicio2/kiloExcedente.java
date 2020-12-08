package listaExercicio2;

import java.util.Scanner;

public class kiloExcedente {
  public static void main(String[] args) {
	double peso,excesso,multa;
	Scanner leia = new Scanner(System.in);
	System.out.println("Quanto kilos pescou hoje: ");
	peso = leia.nextInt();
	if(peso>50) {
		excesso = peso-50;
		multa = excesso*4;
		System.out.println("Você ira pagar R$"+ multa+" de multa. ");
	}
	else {
		System.out.println("Você não precisa pagar nada hoje!");
	}
		
  }
  
}
