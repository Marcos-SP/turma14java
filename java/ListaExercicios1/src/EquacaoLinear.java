import java.util.Scanner;

public class EquacaoLinear {
 public static void main(String[] args) {
	double a, b, c, d, e, f, x, y;
	Scanner leia = new Scanner(System.in);
	System.out.println("Valor de A: ");
	a = leia.nextInt();
	System.out.println("Valor de B: ");
	b = leia.nextInt();
	System.out.println("Valor de C: ");
	c = leia.nextInt();
	System.out.println("Valor de D: ");
	d = leia.nextInt();
	System.out.println("Valor de E: ");
	e = leia.nextInt();
	System.out.println("Valor de F: ");
	f = leia.nextInt();
	x=(c*e-b*f)/(a*e-b*d);
	y=(a*f-c*d)/(a*e - b*d);
	System.out.println("O valor de X é: "+x);
	System.out.println("O valor de Y é: "+y);
} 
}
