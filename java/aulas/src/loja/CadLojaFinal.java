package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaFinal {

	public static void main(String[] args) {
		final int tamanho = 80;
		int anoNascimento = 0;
		char menu, menus = 0, pagamento;
		char at, genero = 0;
		long total;
		String cpf = null;
		String nome = null;
		Scanner leia = new Scanner(System.in);
		Cliente pessoa1 = new Cliente(nome, genero, anoNascimento, cpf);
		pula();
		System.out.printf("\n                                    ASPION");
		pula();
		linhaTamanho(tamanho);
		System.out.println("\n[1] - COMPRAR PRODUTOS");
		System.out.println("\n[2] - GERENCIAR ESTOQUE");
		System.out.println("\n[3] - SAIR");
		menu = leia.next().toUpperCase().charAt(0);
		if (menu == '1') {
			System.out.println("-----CADASTRO CLIENTE-----");
			System.out.println("Nome : ");
			pessoa1.nome = leia.next();
			System.out.println("Genero [M]-Masculino ou [F]-Feminino : ");
			pessoa1.genero = at = leia.next().toUpperCase().charAt(0);
			System.out.println("Ano de nascimento: ");
			pessoa1.anoNascimento = leia.nextInt();
			pessoa1.voltaIdade(anoNascimento);
			System.out.println("CPF : ");
			pessoa1.cpf = leia.next();
			if (genero == 'M') {
				System.out.println("Seja bem vindo a GENCARS Sr." + pessoa1.getNome());
			} else if (genero == 'F') {
				System.out.println("Seja bem vinda a GENCARS Sra." + pessoa1.getNome());
			}

			do {
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
					System.out.println(
							visao.getCodigo() + "\t\t" + visao.getNomeProdutos() + "\t\t" + visao.getPrecoUnitario());
				}
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
							total = visao.precoUnitario * quantidade;
							System.out.println("Preço total : " + total);
							System.out.println("Continuar com a compra [S]-SIM/[N]-NÃO");
							char continuar = leia.next().toUpperCase().charAt(0);
							if (continuar == 'S') {
								System.out.println("FORMA DE PAGAMENTO");
								System.out.println("[1] - PAGAMENTO A VISTA - 10%");
								System.out.println("[2] - DEBITO - VALOR SIMPLES");
								System.out.println("[3] - CREDITO COM 5% A MAIS");
								pagamento = leia.next().toUpperCase().charAt(0);
								if (pagamento == '1') {
									total = (long) (total - (visao.precoUnitario * quantidade * 0.10));
									linhaTamanho(tamanho);
									System.out.println("\nNome : "+pessoa1.nome+"\tCPF: "+pessoa1.cpf+"\tIdade:"+pessoa1.voltaIdade(anoNascimento));
									linhaTamanho(tamanho);
									System.out.println("\n"+visao.getCodigo() + "\t\t" + visao.getNomeProdutos() + "\t\t"
											+ visao.getPrecoUnitario() + "\nQuantidade: " + quantidade);
									System.out.println("\t\t\t"+"Total : " + total);
									linhaTamanho(tamanho);
									System.out.println();

								} else if (pagamento == '2') {
									total = visao.precoUnitario * quantidade;
									linhaTamanho(tamanho);
									System.out.println("\nNome : "+pessoa1.nome+"\tCPF: "+pessoa1.cpf+"\tIdade:"+pessoa1.voltaIdade(anoNascimento));
									linhaTamanho(tamanho);
									System.out.println("\n"+visao.getCodigo() + "\t\t" + visao.getNomeProdutos() + "\t\t"
											+ visao.getPrecoUnitario() + "\nQuantidade: " + quantidade);
									System.out.println("\t\t\t"+"Total : " + total);
									linhaTamanho(tamanho);
									System.out.println();

								} else if (pagamento == '3') {
									total = (long) (total + (visao.precoUnitario * quantidade * 0.05)+(visao.precoUnitario * quantidade * 0.09));
									linhaTamanho(tamanho);
									System.out.println("\nNome : "+pessoa1.nome+"\tCPF: "+pessoa1.cpf+"\tIdade:"+pessoa1.voltaIdade(anoNascimento));
									linhaTamanho(tamanho);
									System.out.println("\n"+visao.getCodigo() + "\t\t" + visao.getNomeProdutos() + "\t\t"
											+ visao.getPrecoUnitario() + "\n\t\t\tQuantidade: " + quantidade);
									System.out.println("\t\t\t"+"Total : " + total);
									linhaTamanho(tamanho);
									System.out.println();

								} 
								
							} else {
								System.out.println("Obrigado!");
								break;
							}
						}

					}
					System.out.println("Deseja realizar outra compra [S]-SIM/[N]-NÃO");
					menus = leia.next().toUpperCase().charAt(0);
				}
				
			} while (menus == 'S');
			{
				System.out.println("Obrigado!");

			}
		} else if (menu == '2') {
			System.out.println("WIP");

		} else {
			System.out.println("WIP");

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