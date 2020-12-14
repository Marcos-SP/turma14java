import java.util.Scanner;

public class ExINSS {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		double SalariSemana, SalariFimDeSemanaSabado, SalariFimDeSemanaSabadoEDomingo, salarioHora, tempoDia,
				tamanho = 80;
		char tipo;
		System.out.println("Quanto voce ganha por hora: ");
		salarioHora = l.nextInt();
		System.out.println("Você trabalha aos sabados? S/N");
		tipo = l.next().toUpperCase().charAt(0);
		while (tipo != 'S' && tipo != 'N') {
			System.out.println("Resposta INVALIDA.Você trabalha aos sabados? S/N");
			tipo = l.next().toUpperCase().charAt(0);
		}

		do {

			if (tipo == 'S') {
				System.out.println("E aos domingos?");
				tipo = l.next().toUpperCase().charAt(0);
				if (tipo == 'S') {
					System.out.println("Parabens");
					SalariFimDeSemanaSabadoEDomingo = 30 * salarioHora;
					System.out.println(SalariFimDeSemanaSabadoEDomingo);
				} else if (tipo == 'N') {
					SalariFimDeSemanaSabado = 26 * salarioHora;
				}

			}
			System.out.println("");
			System.out.println("Resposta INVALIDA.Você trabalha aos sabados? S/N");
			System.out.println("Resposta INVALIDA.Você trabalha aos sabados? S/N");
			tipo = l.next().toUpperCase().charAt(0);

		
		} while (tipo != 'S' || tipo != 'N');
		{
			System.out.println("");
			tipo = l.next().toUpperCase().charAt(0);
		}

	}

	static void linhaTamanho(double tamanho) {

		for (int x = 1; x <= tamanho; x++) {
			System.out.print("-");
		}
	}
}
