import java.util.Scanner;

public class Express�oABC {
	public static void main(String[] args) {
		double a, b, c, d, s, r;
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva o valor de A : ");
		a = leia.nextInt();
		System.out.println("Escreva o valor de B : ");
		b = leia.nextInt();
		System.out.println("Escreva o valor de C : ");
		c = leia.nextInt();
		r = Math.pow(a + b, 2);
		System.out.println("O valor de R �: "+ r);
		s = Math.pow(b + c, 2);
		System.out.println("O valor de S �: "+ s);
		d = (r + s)/ 2;
		System.out.println("O valor de D � "+ d);
	}
	
}
