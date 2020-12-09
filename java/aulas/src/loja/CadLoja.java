package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		final int tamanho = 80;
		char tipo, menu;
		String nome, genero;
		Scanner leia = new Scanner(System.in);
		linhaTamanho(tamanho);
		pula();
		System.out.printf("\n                                    ASPION");
		pula();
		linhaTamanho(tamanho);
		System.out.println("\n[1] - COMPRAR PRODUTOS");
		System.out.println("\n[2] - GERENCIAR ESTOQUE");
		System.out.println("\n[3] - SAIR");
		menu = leia.next().charAt(0);
		if(menu == '1') {
			System.out.println("Nome: ");
			nome = leia.next();
			System.out.println("Genero M/F : ");
			tipo = leia.next().toUpperCase().charAt(0);
			genero(tipo,nome);		
		}
		else if(menu == 2) {
			System.out.println("WIP");
		}
		else {
			System.out.println("Tchau!");
		}
		
		
	}
	static void linhaTamanho(int tamanho) 
	{
		
		for (int x = 1; x <= tamanho; x++) {
			System.out.print("-");
		}

	}
	static void pula()
	{
		System.out.println();
	}	
	public static String genero(char tipo, String nome)
	{	
	  String fds = "" ;
	  if	(tipo == 'M') {
	  System.out.printf("Bem vindo Sr "+nome);
	  }
	  else if( tipo == 'F') {
	  System.out.println("Bem vindo Sra "+ nome);
	  }
	  return fds;
	}
}