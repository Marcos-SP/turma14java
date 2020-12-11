import java.util.Scanner;

public class Exercicio1Vetor {
	public static void main(String[] args) {
		double[] vetor;
		double maior;
		while (true) {
			vetor = new double[5];
			maior = 0;
			for (int i = 0; i < vetor.length; i++) {
				System.out.print("Digite o " + (i + 1) + " Valor");
				vetor[i] = new Scanner(System.in).nextDouble();
				if (vetor[i] > maior) {
					maior = vetor[i];
				}
				System.out.println("O maior valor é :" + maior);
				System.out.println("");
			}
		}
	}
}
