import java.util.Scanner;

public class ObjFuncionario {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		int idade = 0;
		Funcionario funcionario1 = new Funcionario();
		System.out.println("------Dados do funcionario------");
		System.out.println("Nome do Funcinario: ");
		funcionario1.nome = l.next();
		System.out.println("Ano nascimento: ");
		funcionario1.anoNascimento = l.nextInt();
		System.out.println("Genero: ");
		funcionario1.genero = l.next().toUpperCase().charAt(0);
		System.out.println("Profissão: ");
		funcionario1.profissao = l.next();
		System.out.println("Responsabilidades: ");
		funcionario1.responsabilidade = l.next();
		idade=2020-funcionario1.anoNascimento;
		System.out.println("Nome do Funcinario: "+funcionario1.nome);
		System.out.println("Idade: "+idade);
		System.out.println("Genero: "+funcionario1.genero);
		System.out.printf("Profissão: "+funcionario1.profissao);
		System.out.printf("\nResponsabilidades: "+funcionario1.responsabilidade);
		
		
	}

	

}
