package Bancos;
import java.util.Scanner;
public class BancoTestee {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		char op;//visivel em todo o programa - escopo
		char saida;
		int numeroConta=0; //escopo global
		double valor = 0;
		char i;
		System.out.println("BANCO DO ED!!!");
		do
		{
			System.out.println("1 - Abertura de conta: ");
			System.out.println("2 - Acesso a uma conta existente: ");
			System.out.println("3 - Sair: ");
			op = leia.next().charAt(0);
			if (op == '1')
			{
				System.out.println("1 - Conta Poupança");
				System.out.println("2 - Conta Corrente");
				System.out.println("3 - Conta Especial");
				System.out.println("4 - Conta Empresa");
				System.out.println("5 - conta Universitaria");
				System.out.print("Digite o numero de sua opção: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				switch (opconta)
				{
					case '1':
					{
						System.out.println("Digite a data de aniversario da conta: ");
						int dataAniversario = leia.nextInt();
						ContaPoupanca poupanca = new ContaPoupanca(numeroConta,cpfConta,dataAniversario);
					}
					break;	
					case'2':
					{
						ContaCorrente corrente = new ContaCorrente(numeroConta,cpfConta);
					}
					break;
					case'3':
					{
						ContaEspecial especial = new ContaEspecial(numeroConta,1000);
					}
					break;
					case'4':
					{
						
						System.out.println("Limite emprestimo");
						ContaEmpresa empresa = new ContaEmpresa(numeroConta,cpfConta,10000);
						for( int x=0;x<2; x++) {
							System.out.println("Deseja [D]-Debitar ou [C]-Creditar");
						
						i = leia.next().toUpperCase().charAt(0);
						System.out.println("Digite o valor : ");
						valor = leia.nextDouble();
						if (i == 'D') {
							empresa.debito(valor);
						}
						else if(i =='C') {
							empresa.credito(valor);
						}
						System.out.println("Valor disponivel:"+empresa.getSaldo());
						System.out.println("Deseja realizar um emprestimo?");
						i = leia.next().toUpperCase().charAt(0);
						if(i =='S')
						{
							System.out.println("Digite o valor de emprestimo:");
							double valorEmprestimo=leia.nextDouble();
							empresa.emprestar(valorEmprestimo);
						}
						else if(i=='N')
						{
							System.out.println(empresa.getSaldo());
						}
						else {
							System.out.println("DIGITO INVÁLIDO");
						}
						//System.out.println("Deseja continuar S/N");
						//i = leia.next().toUpperCase().charAt(0);
						
						
						}
					}
					break;
					case'5':
					{
						// ContaUniversitaria universitaria = new ContaUniversitaria (numeroConta,cpfConta,10000);
					}
					break;
				}
				
				
			}
			else if (op == '2')
			{
				System.out.println("wip");
			}
			else
			{
				
			}
			System.out.println("Continua S/N");
			saida = leia.next().toUpperCase().charAt(0);
			if (saida != 'S') {
				break;
			}
		
		} while(true);
				
	}
}