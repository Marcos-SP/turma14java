import java.util.Scanner;

public class EntradaSaida {
		public static void main(String[] args) {
			int a, b, soma;
			Scanner leia = new Scanner(System.in);
			System.out.println("Primeiro número: ");
			a=leia.nextInt(); //Indique a variavel a ser lida, e também que é do tipo inteiro.
			System.out.println("Segundo número: ");
			b=leia.nextInt();
			soma = a+b;
			System.out.println("Valor da soma: "+soma);
			
		}
}
