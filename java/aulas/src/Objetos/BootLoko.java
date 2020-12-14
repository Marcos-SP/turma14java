package Objetos;

import java.util.Scanner;

public class BootLoko {
 public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);
	 Pessoa visitante = new Pessoa();
	 Pessoa visitante2 = new Pessoa("Marquinhos");
	 int idade;
	 System.out.println("Nome : ");
	 visitante.nome= leia.next();
	 System.out.println("Ano de nascimento: ");
	 visitante.anoNascimento = leia.nextInt();
	 visitante.retornaidade();
	 System.out.println(visitante.idade);

	 
}
}
