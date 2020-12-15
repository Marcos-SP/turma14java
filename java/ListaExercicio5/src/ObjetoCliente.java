import java.util.Scanner;

public class ObjetoCliente {

	public static void main(String[] args) {
		Scanner l= new Scanner(System.in);
		Cliente cliente1= new Cliente();//Quando não tiver parametros, faazer um construtor sem parametros.
		System.out.println("Qual sua renda mensal?");
		cliente1.money= l.nextInt();
		if (cliente1.money<2000) {
			System.out.println("Desculpe voce não pode ser nosso cliente");
		}
		else {
			System.out.println("Voce está aceito na nossa lista de clientes!");
			System.out.println("Digite seu nome: ");
			cliente1.name = l.next();
			System.out.println("Ano de nascimento: ");
			cliente1.age = l.nextInt();
			System.out.println("Genero: [M]-Masculino [F]-Feminino");
			cliente1.sex = l.next().toUpperCase().charAt(0);
			if (cliente1.sex == 'M') {
				System.out.println("Bem vindo Sr, "+cliente1.name);
				System.out.println("Idade: "+cliente1.age);
				System.out.println("Sua renda é, "+cliente1.money);
				
				
			}
			else if (cliente1.sex == 'F') {
				System.out.println("Bem vindo Sra, "+cliente1.name);
				System.out.println("Idade: "+cliente1);
				System.out.println("Sua renda é, "+cliente1.money);
				
				
			}
			else {
				System.out.println("INVALIDO");
			}
			
			
		}
		
		

	}
}



