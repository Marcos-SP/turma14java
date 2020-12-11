import java.util.Random;
import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		int valores[] = new int [10];
		int maior=0;
		int total=0;
		for (int x = 0; x < valores.length; x++) {
			valores[x]= random.nextInt(5)+1;
			if(valores[x]>maior) {
				maior=valores[x];
				
			}


			total=valores[x]+total;
					
		System.out.println(x+1+"°-Valor "+ valores[x]);
		}
		System.out.println("Maior valor :"+maior);
		System.out.println("Media valores: "+total/10);
	}

}
