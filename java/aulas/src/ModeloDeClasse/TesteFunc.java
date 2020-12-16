package ModeloDeClasse;

public class TesteFunc {
 public static void main(String[] args) {
	Funcionario normal = new Funcionario("Marcos",44,10.00);
	Terceiro folguista = new Terceiro("Marquinhos",20,110.00,50);
	System.out.printf("O funcionario %s recebe R$ %.2f", normal.getNome(), normal.pagamentoSalario(0, 0));
	System.out.printf("\nO funcionario %s recebe R$ %.2f", folguista.getNome(), folguista.pagamentoSalario(0, 0));
 }
 }
