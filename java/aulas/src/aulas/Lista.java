package aulas;

import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nomeAlunos[] = { "Allen de Lima Vieira", "Andr� de Brito Silva da Costa", "B�rbara Liboni Guerra",
				"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
				"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
				"FERNANDA AGAPITO", "Fernanda Barbosa Ferraz", "Francisco Jos� Pires", "Gabriel Enrique Cabral Silva",
				"Gabriel S�rgio Nascimento Santos Gon�alves", "Gide�o da Silva Idelfonso", "GILSON AMORIM DE MATOS",
				"Guilherme Gon�alves da Silva", "Gustavo Rabelo Teles", "HELOISA BEATRIZ DE OLIVEIRA COSTA",
				"Igor Mateus Queiroz Gato", "Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura",
				"Jos� Jorge Hauck J�nior", "Juliana Santos Andr�", "K�lven Cleiton de Ara�jo Brand�o",
				"La�s Lima Santos", "Lucas anseloni barros", "Lucas Gon�alves da SIlva", "luis felipe da silva",
				"Luiz Felipe da Silva Magalh�es", "Marcos Eduardo Gomes Gon�alves", "Micaely da Silva Lima",
				"Rafaela Oliveira Silva", "Tiago dos Santos Martins", "Ver�nica Navarro Almenara",
				"Vinicius Alves Miranda" };
		char sexoAlunos[] = { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'M',
				'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F', 'M',
				'M' };
		int matriculas[] = new int[40];
		double notas[] = new double[40];
		int matricula = 0;
		int pesquisa = 0;
		String aux;

		for (int x = 0; x < 40; x++) {
			matriculas[x] = x + 1;
		}

		System.out.println("MAT\tTIPO\tNOME");
		for (int x = 0; x < 40; x++) {
			if (sexoAlunos[x] == 'M') {
				aux = "Aluno";
			} else {
				aux = "Aluna";
			}
			System.out.printf("%d \t%s \t%s \n", matriculas[x], aux, nomeAlunos[x]);
		}
		System.out.println("DIgite matricula : ");
		matricula = leia.nextInt();
		for (int indice = 0; indice <40; indice++)
		{ //
		if (matriculas[indice]==matricula) { //varrer vetor
			pesquisa=indice;
		}
		System.out.printf("%d \t%s \n",matriculas[pesquisa], nomeAlunos[pesquisa]);
		}
}
}