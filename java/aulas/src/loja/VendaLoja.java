package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendaLoja {

	public static void main(String[] args) {
		// Instanciação completa de objeto
		Scanner leia = new Scanner(System.in);
		char at;
		// Usar Interfece
		List<Produtos> prodLista = new ArrayList<>();
		prodLista.add(new Produtos("FERRARI", "FDS-001", 4000000));
		prodLista.add(new Produtos("MCLAREN", "FDS-002", 2000000));
		prodLista.add(new Produtos("TESLA", "FDS-003", 200000));
		prodLista.add(new Produtos("VOLVO", "FDS-004", 100000));
		prodLista.add(new Produtos("FIAT", "FDS-005", 30000));
		prodLista.add(new Produtos("JEEP", "FDS-006", 80000));
		prodLista.add(new Produtos("AUDI", "FDS-007", 140000));
		prodLista.add(new Produtos("TOYOTA", "FDS-008", 60000));
		prodLista.add(new Produtos("HONDA", "FDS-009", 50000));
		System.out.println("-----------------------------------------\t\t");
		System.out.println("\t\tGenCars\t\t");
		System.out.println("-----------------------------------------\t\t");
		System.out.println("CODIGO" + "\t\tNOME" + "\t\tPREÇO");
		System.out.println("-----------------------------------------\t\t");
		for (Produtos visao : prodLista) {
			System.out
					.println(visao.getCodigo() + "\t\t" + visao.getNomeProdutos() + "\t\t" + visao.getPrecoUnitario());
		}
		System.out.println("Deseja comprar um produto? S/N");
		at = leia.next().toUpperCase().charAt(0);
		if (at == 'S') {
			System.out.println("Entre com o [CÓDIGO] do produto");
			String codigo = leia.next().toUpperCase();
			System.out.println("Quantidade do produto");
			int quantidade = leia.nextInt();
			for (Produtos visao : prodLista) {
				if (codigo.equals(visao.getCodigo())) {
					System.out.println("CODIGO" + "\t\tNOME" + "\t\tPREÇO");
					System.out.println(visao.getCodigo() + "\t\t" + visao.getNomeProdutos() + "\t\t"
							+ visao.getPrecoUnitario() + "\nQuantidade: " + quantidade);
					System.out.println("Preço total : " + visao.precoUnitario * quantidade);
				}

			}
		}
	}
}
/*
 * System.out.println("Quantos Funcionario irá cadastar: "); int qtde =
 * leia.nextInt(); for (int x = 1; x <= qtde; x++) {
 * System.out.printf("FUNCIONARIO %d-DIGITE DADOS\n", x);
 * System.out.println("Terceiros S/N: "); char op =
 * leia.next().toUpperCase().charAt(0); System.out.println("DIGITE O NOME");
 * String nome = leia.next(); System.out.println("HORAS MENSAIS: "); int horas =
 * leia.nextInt(); System.out.println("QUAL O VALOR HORA: "); double valor =
 * leia.nextDouble(); if (op == 'S') {
 * System.out.println("DIGITE O ADCINAL TERCEIRO: "); double adicional =
 * leia.nextDouble(); lista.add(new Terceiro(nome, horas, valor, adicional)); }
 * else { lista.add(new Funcionario(nome, horas, valor)); } }
 * 
 * System.out.println(); System.out.println("PAGAMENTO"); for (Funcionario func
 * : lista) { // VARRER VETOR System.out.println(func.getNome() + " - " +
 * func.horasMensais + " - " + func.getValorHora() + "-" +
 * func.pagamentoSalario(0, 0)); } }
 * 
 * }
 */