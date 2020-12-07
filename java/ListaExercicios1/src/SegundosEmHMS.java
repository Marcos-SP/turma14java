import java.util.Scanner;

public class SegundosEmHMS {
	public static void main(String[] args) {
		int segundos, horas, minutos, restoSegundos;
		Scanner leia = new Scanner(System.in);
		System.out.println("Tempo em segundos: ");	
		segundos = leia.nextInt();
		horas = (segundos/ 3600);
		minutos = ((segundos %3600)/60);
		restoSegundos = ((segundos % 3600)%60);
		System.out.println(horas+":"+minutos+":"+restoSegundos);
	}
}
