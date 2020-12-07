import java.util.Scanner;

public class MédiaPonderada {

	public static void main(String[] args) {
		int nota1,nota2, nota3, media;
		Scanner leia = new Scanner(System.in);
		System.out.println("Primeira nota : ");
		nota1 = leia.nextInt();
		System.out.println("Segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("Terceira nota : ");
		nota3 = leia.nextInt();
		media= ((nota1*2)+(nota2*3)+(nota3*5))/10;
		System.out.println("Média do aluno: "+ media);
		
	}

}
