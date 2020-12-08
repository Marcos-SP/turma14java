package listaExercicio2;

import java.util.Scanner;

public class horasTrabalhadasOperario {
	public static void main(String[] args) {
		double codigoOperario,numeroHorasTrabalhadas, excedente, total;
		Scanner leia = new Scanner(System.in);
		System.out.println("Código do Operario: ");
		codigoOperario = leia.nextInt();
		System.out.println("Horas Trabalhadas : ");
		numeroHorasTrabalhadas = leia.nextInt();
		if(numeroHorasTrabalhadas>50) {
			numeroHorasTrabalhadas= numeroHorasTrabalhadas*10;
			excedente = (numeroHorasTrabalhadas-500)/10;
			excedente = excedente*20;
		}
		else {
			numeroHorasTrabalhadas= numeroHorasTrabalhadas*10;
			excedente = 0;
		}
		total=numeroHorasTrabalhadas+excedente;
		System.out.println("Trabalhador: "+codigoOperario);
		System.out.println("Salario: "+ numeroHorasTrabalhadas);
		System.out.println("Salario excedente:"+excedente);
		System.out.println("Salario Total:"+total);
		


		
	}

	
		
	}
	
