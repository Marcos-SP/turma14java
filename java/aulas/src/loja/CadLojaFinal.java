package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaFinal {

	public static void main(String[] args) {
		final int tamanho = 80;
		char tipo, menu;
		int escolhido = 0;
		String sacola;
		String nome, genero;
		Scanner leia = new Scanner(System.in);
		char at;
		linhaTamanho(tamanho);
		pula();
		System.out.printf("\n                                    GENCARS");
		pula();
		linhaTamanho(tamanho);
		System.out.println("\n[1] - COMPRAR PRODUTOS");
		System.out.println("\n[2] - GERENCIAR ESTOQUE");
		System.out.println("\n[3] - SAIR");
		menu = leia.next().charAt(0);
		if (menu == '1') {
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
			linhaTamanho(tamanho);
			pula();
			System.out.println("\t\t\tGenCars\t\t");
			linhaTamanho(tamanho);
			pula();
			System.out.println("CODIGO" + "\t\tNOME" + "\t\tPREÇO");
			pula();
			linhaTamanho(tamanho);
			pula();
			for (Produtos visao : prodLista) {
				System.out.println(
						visao.getCodigo() + "\t\t" + visao.getNomeProdutos() + "\t\t" + visao.getPrecoUnitario());
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
					}else {
						System.out.println("Obrigado por usar a GENCARS");
						break;
					}
				}
			}
		
			} 
			else if (menu == 2) {
				System.out.println("WIP");
			} else {
				System.out.println("Tchau");
			}
		}
	

	static void linhaTamanho(int tamanho) {

		for (int x = 1; x <= tamanho; x++) {
			System.out.print("-");
		}

	}

	static void pula() {
		System.out.println();
	}

	public static String genero(char tipo, String nome) {
		String fds = "";
		if (tipo == 'M') {
			System.out.printf("Bem vindo Sr " + nome);
		} else if (tipo == 'F') {
			System.out.println("Bem vindo Sra " + nome);
		}
		return fds;
	}
}