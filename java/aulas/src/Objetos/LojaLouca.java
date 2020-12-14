package Objetos;

import java.util.Scanner;

public class LojaLouca {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Pessoa cliente = new Pessoa();
		Pessoa cliente2 = new Pessoa();
		Produtos produto1 = new Produtos();//ConstrutorVazio
		Produtos produto2 = new Produtos("Blusa", 20,20);//Construtor Completo
		Produtos produto3 = new Produtos("Camisa", 20);
		Produtos produto4 = new Produtos("Calça Jeans", 5);
		produto1.nomeProdutos = "Vestido";
		produto1.quantidadeProduto = 3;
		produto1.valorUnitario = 100;
		//produto2.nomeProdutos = "Blusa";}}
		//produto2.quantidadeProduto = 1;}}} Mesma Coisa que o construtor^
		//produto2.valorUnitario = 50;}}}}}}
		produto3.nomeProdutos = "Camisa";
		produto3.quantidadeProduto = 20;
		produto3.valorUnitario = 20;
		produto4.nomeProdutos = "Calça Jeans";
		produto4.quantidadeProduto = 5;
		produto4.valorUnitario = 60;
		cliente2.nome = "Ed";
		cliente2.genero = 'm';
		cliente2.anoNascimento = 1974;

		System.out.println("Bom dia digite seu nome: ");
		cliente.nome = leia.next();
		System.out.println("VOce é masculino ou feminino: M/F");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		if (cliente.genero == 'M') {
			System.out.printf("Bom dia  SR.%s", cliente.nome);
			System.out.printf("Produtos disponiveis: \n%s \n%s \n%s \n%s",produto1.nomeProdutos,produto2.nomeProdutos,produto3.nomeProdutos,produto4.nomeProdutos);
			
		}

	}

}
