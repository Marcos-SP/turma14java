import java.util.Scanner;

public class EntradaSaida {
		public static void main(String[] args) {
			int a, b, soma;
			Scanner leia = new Scanner(System.in);
			System.out.println("Primeiro n�mero: ");
			a=leia.nextInt(); //Indique a variavel a ser lida, e tamb�m que � do tipo inteiro.
			System.out.println("Segundo n�mero: ");
			b=leia.nextInt();
			soma = a+b;
			System.out.println("Valor da soma: "+soma);
			
		}
}
