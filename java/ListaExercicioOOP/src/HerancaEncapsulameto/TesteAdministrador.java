package HerancaEncapsulameto;

import java.util.Scanner;

public class TesteAdministrador {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		Administrador adm =new Administrador("Marcos","11940028922","AV.Oculos");
		adm.setAjudaDeCusto(1000);
		System.out.println("------TESTE ADM------");
		System.out.println(adm.getNome()+" "+adm.getTelefone()+" "+adm.getEndereço());
		System.out.println("Ajuda de custo diponivel: "+adm.ajudaViagens(adm.getAjudaDeCusto()));
		
	}

}
