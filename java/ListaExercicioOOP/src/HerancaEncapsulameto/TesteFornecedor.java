package HerancaEncapsulameto;

import java.util.Scanner;

public class TesteFornecedor {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		Fornecedor fornecedor1 = new Fornecedor();
		fornecedor1.Credito(1000);
		fornecedor1.divida(500);
		fornecedor1.setNome("Marcos");
		fornecedor1.setTelefone("1140028922");
		fornecedor1.setEndereço("Av.1");
		System.out.println("Teste Fornecedor");
		System.out.println(fornecedor1.getNome()+"  "+fornecedor1.getTelefone()+"  "+fornecedor1.getEndereço());
		System.out.println(fornecedor1.getSaldo());
		
	}

}
