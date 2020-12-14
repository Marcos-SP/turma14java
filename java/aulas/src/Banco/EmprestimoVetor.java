package Banco;

import java.util.Random;
import java.util.Scanner;

public class EmprestimoVetor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 Random r= new Random();

		final int tamanho = 80;
		final int MAXMOVIMENTACOES = 3;
		String clientes[] = new String[] { "Allen de Lima Vieira", "André de Brito Silva da Costa",
				"Bárbara Liboni Guerra", "Beatriz Martins", "Beymar Jhoel Acapa Lima",
				"Breno Nogueira Botelho Noccioli", "Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira",
				"Danilo Pereira da Silva", "Davi Silva Vieira", "Diego Vinicio da Silva Nascimento",
				"Erick Costa Ferreira", "Ewerton Inacio Lima", "Fernanda Agapito", "Fernanda Barbosa Ferraz",
				"Francisco José Pires", "Gabriel Enrique Cabral", "Gabriel Sérgio Nascimento Santos Gonçalves",
				"Gideão da Silva Idelfonso", "Gilson Amorim de Matos", "Guilherme Gonçalves da Silva",
				"Gustavo Rabelo Teles", "Heloisa Beatriz de Oliveira Costa", "Igor Mateus Queiroz Gato",
				"Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura", "José Jorge Hauck Júnior",
				"Juliana Santos André", "Kélven Cleiton de Araújo Brandão", "Laís Lima Santos", "Lucas Anseloni Barros",
				"Lucas Gonçalves da Silva", "Luis felipe da silva", "Luiz Felipe da Silva Magalhães",
				"Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima", "Rafaela Oliveira Silva",
				"Tiago dos Santos Martins", "Verônica Navarro Almenara", "Vinicius Alves Miranda" };
		char genero[] = new char[] { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M',
				'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F',
				'M', 'F', 'M' };
		int tipoConta[] = new int[40];
		int conta[] = new int[40];
		int contaUsuario, opcao;
		double saldo[] = new double[40];
		double maximoEmprestimo[] = new double [40];
		char tConta, continuar;
		double saldoConta;
		char a = ' ';
		double emprestimo;
		saldoConta = 0.0;
		int empresa[]=new int[10];
		for(int x=0;x<40;x++) {
			 maximoEmprestimo[x]=r.nextInt(9000)+1000;
			 //System.out.println(maximoEmprestimo[x]);
		}

		 
		
	}
}
