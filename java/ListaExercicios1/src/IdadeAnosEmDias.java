import java.util.Scanner;

public class IdadeAnosEmDias {
		public static void main(String[] args) {
			int tempoDias;
			try (Scanner leia = new Scanner(System.in)) { //Perguntar Ed
				System.out.println("Escreva o tempo em dias: ");
				tempoDias = leia.nextInt();
			}
			System.out.println("Anos: "+tempoDias/365+" Meses : "+
			(tempoDias%365)/30+" Dias: "+ tempoDias%30);
			
			
		}
}
