package BancoFinal;

import java.util.Scanner;

public class BancoFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX_MOVIMENTOS = 3;
		int data,operacao, numeroConta = 0, tamanho = 50;
		double valor, valorEmprestimo;
		char opcao, opConta;

		do {
			linha(tamanho);
			System.out.println("\n\t\tBANCO G6");
			linha(tamanho);

			System.out.println("\n[1] - Abertura de conta");
			System.out.println("[2] - Acesso a uma conta existente");
			System.out.println("[3] - Sair");
			operacao = sc.next().charAt(0);

			if (operacao == '1') {
				linha(tamanho);
				System.out.println("\n\t\tTIPOS DE CONTAS");
				linha(tamanho);
				System.out.println("\n[1] - Conta Poupan�a");
				System.out.println("[2] - Conta Corrente");
				System.out.println("[3] - Conta Especial");
				System.out.println("[4] - Conta Empresa");
				System.out.println("[5] - conta Universitaria");
				System.out.print("Digite o numero de sua op��o: ");
				opConta = sc.next().charAt(0);
				numeroConta++;
				sc.nextLine();
				System.out.println("Digite o seu CPF: ");
				String cpfConta = sc.nextLine();
				switch (opConta) {
				case '1':
					System.out.println("Digite a data de aniversario da conta: ");
					int dataAniversario = sc.nextInt();
					ContaPoupanca cp = new ContaPoupanca(numeroConta, cpfConta, dataAniversario);
					System.out.println("Digite a data de hoje: ");
					data = sc.nextInt();
					linha(tamanho);
					System.out.println("\n\t\tConta Poupan�a");
					linha(tamanho);
					System.out.println("\nN�mero da conta: " + cp.getNumConta());
					System.out.println("CPF: " + cp.getCpfConta());
					System.out.println("Anivers�rio da conta: " + cp.getDataAniversarioConta());
					System.out.println("Saldo: " + cp.getSaldoConta());
					linha(tamanho);
					for (int i = 0; i < MAX_MOVIMENTOS; i++) {
						do {
							System.out.println("\nVoc� quer [D] Depositar ou [R] Retirar?");
							opcao = sc.next().toUpperCase().charAt(0);
						} while (opcao != 'D' && opcao != 'R');
						if (opcao == 'D') {
							System.out.println("Digite o valor de dep�sito: ");
							valor = sc.nextDouble();
							cp.depositar(valor);
						} else {
							System.out.println("Digite o valor de retirada: ");
							valor = sc.nextDouble();
							cp.retirar(valor);
						}
						System.out.println("Saldo total: R$" + cp.getSaldoConta());
					}
					linha(tamanho);
					System.out.println("\n");
					cp.correcaoPoupanca(data);
					System.out.println("Saldo total: " + cp.getSaldoConta());

					break;
				case '2':
					ContaCorrente dm = new ContaCorrente(numeroConta, cpfConta);
					linha(tamanho);
					System.out.println("\n\t\tConta Corrente");
					linha(tamanho);
					System.out.println("\nN�mero da conta: " + dm.getNumConta());
					System.out.println("CPF: " + dm.getCpfConta());
					System.out.println("Saldo: " + dm.getSaldoConta());
					linha(tamanho);
					for (int i = 0; i < MAX_MOVIMENTOS; i++) {
						do {
							System.out.println("\nVoc� quer [D] Depositar ou [R] Retirar?");
							opcao = sc.next().toUpperCase().charAt(0);
						} while (opcao != 'D' && opcao != 'R');
						if (opcao == 'D') {
							System.out.println("Digite o valor de dep�sito: ");
							valor = sc.nextDouble();
							dm.depositar(valor);
							;
						} else {
							System.out.println("Digite o valor de retirada: ");
							valor = sc.nextDouble();
							dm.retirar(valor);
						}
						System.out.println("Saldo total: R$ " + dm.getSaldoConta());
					}
					linha(tamanho);
					System.out.println("\nSaldo total: R$ " + dm.getSaldoConta());
					dm.talao(dm.getTalao(), dm.getQtdTalao());
					break;
				case '3':
					ContaEspecial dv = new ContaEspecial(numeroConta, cpfConta);
					linha(tamanho);
					System.out.println("\n\t\tConta Especial");
					linha(tamanho);
					System.out.println("\nN�mero da conta: " + dv.getNumConta());
					System.out.println("CPF: " + dv.getCpfConta());
					System.out.println("Saldo: " + dv.getSaldoConta());
					linha(tamanho);
					for (int i = 0; i < MAX_MOVIMENTOS; i++) {
						do {
							System.out.println("\nVoc� quer [D] Depositar ou [R] Retirar?");
							opcao = sc.next().toUpperCase().charAt(0);
						} while (opcao != 'D' && opcao != 'R');
						if (opcao == 'D') {
							System.out.println("Digite o valor de dep�sito: ");
							valor = sc.nextDouble();
							dv.depositar(valor);
							;
						} else {
							System.out.println("Digite o valor de retirada: ");
							valor = sc.nextDouble();
							dv.retirar(valor);

						}
						System.out.println("Saldo total: R$ " + dv.getSaldoConta());
						System.out.println("Limite Atual: R$ " + dv.getLimiteEspecial());
					}
					linha(tamanho);
					System.out.println("\nSaldo total: R$ " + dv.getSaldoConta());
					System.out.println("Limite Atual: R$ " + dv.getLimiteEspecial());
					dv.talao(dv.getTalao(), dv.getQtdTalao());
					break;
				case '4':

					ContaEmpresa mg = new ContaEmpresa(numeroConta, cpfConta);
					linha(tamanho);
					System.out.println("\n\t\tConta Poupan�a");
					linha(tamanho);
					System.out.println("\nN�mero da conta: " + mg.getNumConta());
					System.out.println("CPF: " + mg.getCpfConta());
					System.out.println("Saldo: " + mg.getSaldoConta());
					linha(tamanho);
					for (int i = 0; i < MAX_MOVIMENTOS; i++) {
						do {
							System.out.println("\nVoc� quer [D] Depositar ou [R] Retirar?");
							opcao = sc.next().toUpperCase().charAt(0);
						} while (opcao != 'D' && opcao != 'R');
						if (opcao == 'D') {
							System.out.println("Digite o valor de dep�sito: ");
							valor = sc.nextDouble();
							mg.depositar(valor);
						} else {
							System.out.println("Digite o valor de retirada: ");
							valor = sc.nextDouble();
							mg.retirar(valor);
						}
						do {
							System.out.println("Voc� quer um empr�stimo? ");
							opcao = sc.next().toUpperCase().charAt(0);
						} while (opcao != 'S' && opcao != 'N');
						if (opcao == 'S') {
							System.out.println("Digite o valor: R$ ");
							valorEmprestimo = sc.nextDouble();
							mg.emprestar(valorEmprestimo);
						}
						System.out.println("Saldo total: " + mg.getSaldoConta());
						System.out.println("Valor de emprestimo disponivel:" + mg.getEmprestimoEmpresa());
					}
					linha(tamanho);
					System.out.println("\nSaldo total: " + mg.getSaldoConta());
					System.out.println("Valor de emprestimo disponivel:" + mg.getEmprestimoEmpresa());
					break;
				case '5':
					System.out.println("\nWIP!!");
					break;
				}

			} else if (operacao == '2') {
				System.out.println("\nWIP!!");
				System.out.println("Obrigado por utilizar o nosso APP!");
				break;
			} else {
				System.out.println("\nWIP!!");
				System.out.println("Obrigado por utilizar o nosso APP!");
				break;
			}
			System.out.println("Deseja continuar utilizando o APP1 (S ou N)? ");
			opcao = sc.next().toUpperCase().charAt(0);
			if (opcao == 'N') {
				break;
			}
		} while (true);
		System.out.println("Obrigado por utilizar o nosso APP!");
	}

	static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("=");
		}
	}
}
