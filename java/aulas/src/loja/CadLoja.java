package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		final int tamanho = 80;
		char tipo, menu;
		int escolhido = 0;
		String sacola;
		String nome, genero;
		Scanner leia = new Scanner(System.in);
		String codigos[] = new String[10];
		String produtos[] = {"Esportivo","Esportivo clássico","Picape","jipe","Sedan","JEEP","AUDI","LANDROVER","TOYOTA","HONDA"};
		double precoUnitarios[] = {1000000,2000000,150000,90000,50000,80000,120000,30000,40000,50000};
		int estoque[] = new int[10];
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
			pula();
			linhaTamanho(tamanho);
			System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\t\tPRODUTO");
			linhaTamanho(tamanho);
			for (int x=0; x<10; x++)
			{
				estoque[x]=10;
				codigos[x]=(x<9)?"\nSDF-00"+(x+1):"\nSDF-0"+(x+1);
				System.out.printf("%s\t\t%.2f\t%d\t\t%s\n",codigos[x],precoUnitarios[x],estoque[x],produtos[x]);
				
			}
			System.out.println("Qual produto voce deseja Comprar[CODIGO]");
			sacola=leia.next();
			for(int x =1;x<10;x++) {
				if(codigos[x].equals(sacola)) {
					escolhido = x;
				}
			}
			System.out.println(escolhido);
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