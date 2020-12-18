package Bancos;

import java.util.Scanner;

public class TesteContaEmprestimo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ContaEmpresa CE = new ContaEmpresa(12,1200);
		char i;
		double valor = 0;
		System.out.println("TESTE EMPRESA");
		
		do {
			System.out.println("Deseja [D]-Debitar ou [C]-Creditar");
			i = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite o valor : ");
			valor = leia.nextDouble();
			if (i == 'D') {
				CE.debito(valor);
			}
			else if(i =='C') {
				CE.credito(valor);
			}
			System.out.println("Valor disponivel:"+CE.getSaldo());
			System.out.println("Deseja realizar um emprestimo?");
			i = leia.next().toUpperCase().charAt(0);
			if(i =='S')
			{
				System.out.println("Digite o valor de emprestimo:");
				double valorEmprestimo=leia.nextDouble();
				CE.emprestar(valorEmprestimo);
			}
			else if(i=='N')
			{
				System.out.println(CE.getSaldo());
			}
			else {
				System.out.println("DIGITO INVÁLIDO");
			}
			System.out.println("Deseja continuar S/N");
			i = leia.next().toUpperCase().charAt(0);
			
			
		} while(i == 'S');
		
	}

}
