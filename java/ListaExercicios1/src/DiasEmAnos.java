import java.util.Scanner;

public class DiasEmAnos {
	public static void main(String[] args) {
		int tempoAnos, tempoMeses, tempoDias, diasTotais;
		try (Scanner leia = new Scanner(System.in);) {
			System.out.println("Anos : ");
			tempoAnos = leia.nextInt();
			System.out.println("Meses : ");
			tempoMeses = leia.nextInt();
			System.out.println("Dias : ");
			tempoDias = leia.nextInt();
			System.out.println();
		}
		diasTotais = tempoDias + (tempoAnos * 365) + (tempoMeses * 30);
		System.out.println("Você tem " + diasTotais + ", dias na terra");
	}
}
