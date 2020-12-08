package listaExercicio2;

import java.util.Scanner;
import java.util.Locale;
public class indicePoluicao {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		double indice;
		System.out.println("Entre com o indice de hoje[Numero entre 0.05 e 0.5]");
		indice = input.nextDouble();
		System.out.println((indice>=0.05 && indice<=0.25)?"Aceitavel":(indice>=0.3 && indice<=0.39)?"Grupo 1 suspenda as atividade.":(indice>=0.4 && indice<=0.49)?"Grupo 1 e Grupo 2, suspendam as atividade.":(indice>0.5)?"Todos grupos suspendam as atividade.":"Numero invalido");
}
}
