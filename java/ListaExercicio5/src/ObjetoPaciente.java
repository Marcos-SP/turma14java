import java.util.Scanner;

public class ObjetoPaciente {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		Paciente paciente1 = new Paciente();
		System.out.println("Nome : ");
		paciente1.nome =l.next();
		System.out.println("Situa��o Paciente [B]Bem/[M]Mal");
		paciente1.situacao =  l.next().toUpperCase().charAt(0);
		System.out.println(paciente1.nome);
		System.out.println((paciente1.situacao=='B')?"A situa��o do paciente � boa":(paciente1.situacao=='M')?"A situa��o do paciente � ruim":(paciente1.situacao!='M' || paciente1.situacao!='B')?"Invalido":"");
	
	}
}
