package aulas;

import java.util.Scanner;

public class RetornoIdade {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anoNascimento = 0;
		int idade = 0;
		System.out.println("Entre com ano do seu nacimento");
		anoNascimento = leia.nextInt();
		//System.out.println(idade(anoNascimento));
		tipoIdade(anoNascimento);
	}
	static int idade(int anoNascimento) {
		int anoAtual = 2020;
		int idade = 0;
		idade = anoAtual - anoNascimento;
		return idade;
	}
	static void tipoIdade(int anoNascimento) {
		if(idade(anoNascimento)<18) {
			System.out.printf("Voce tem %d anos, considerado  infanto-juvenil", idade(anoNascimento) );
		}
		else if(idade(anoNascimento)<60) {
			System.out.println("Voce tem "+idade(anoNascimento) +" anos ,  considerado adulto");
		}
		else {
			System.out.println("Voce tem "+idade(anoNascimento) +"anos , considerado idoso");
		}
	}
	}

