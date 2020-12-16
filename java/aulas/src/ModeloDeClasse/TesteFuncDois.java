package ModeloDeClasse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFuncDois {

	public static void main(String[] args) {
		// Instanciação completa de objeto
		Scanner leia = new Scanner(System.in);
		// Usar Interfece
		List<Funcionario> lista = new ArrayList<>();
		System.out.println("Quantos Funcionario irá cadastar: ");
		int qtde = leia.nextInt();
		for (int x = 1; x <= qtde; x++) {
			System.out.printf("FUNCIONARIO %d-DIGITE DADOS\n", x);
			System.out.println("Terceiros S/N: ");
			char op = leia.next().toUpperCase().charAt(0);
			System.out.println("DIGITE O NOME");
			String nome = leia.next();
			System.out.println("HORAS MENSAIS: ");
			int horas = leia.nextInt();
			System.out.println("QUAL O VALOR HORA: ");
			double valor = leia.nextDouble();
			if (op == 'S') {
				System.out.println("DIGITE O ADCINAL TERCEIRO: ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(nome, horas, valor, adicional));
			} else {
				lista.add(new Funcionario(nome, horas, valor));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTO");
		for (Funcionario func:lista) {     //VARRER VETOR
			System.out.println(func.getNome()+" - "+func.horasMensais+" - "+func.getValorHora()+"-"+func.pagamentoSalario(0, 0));
		}
	}

}
