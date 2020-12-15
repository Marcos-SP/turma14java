
public class Funcionario  {
	public String nome;
	public char genero; //Toda pessoa tem genero
	public int anoNascimento;//Toda pessoa tem ano de nascimento
	public int idade;
	public int salario;
	public String profissao;
	public String responsabilidade;
	public Funcionario(String nome, char genero, int anoNascimento, int idade, int salario, String profissao,
			String responsabilidade) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
		this.idade = idade;
		this.salario = salario;
		this.profissao = profissao;
		this.responsabilidade = responsabilidade;
	}
	public Funcionario() {
		
	}
	public int retornaidade(int anoNascimento) {
		int idade = 0;
		idade=2020-this.anoNascimento;
		return idade;
	}
	public static String genero(char tipo, String nome)
	{	
	  String fds = "" ;
	  if	(tipo == 'M') {
	  System.out.printf("O funcinario, "+nome);
	  }
	  else if( tipo == 'F') {
	  System.out.println("A funcionaria, "+ nome);
	  }
	  return fds;
	}
	
}
