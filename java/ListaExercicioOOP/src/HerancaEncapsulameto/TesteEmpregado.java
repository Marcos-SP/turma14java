package HerancaEncapsulameto;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado();
		double salario;
		empregado1.setNome("Marcos");
		empregado1.setCodigoSetor(100);	
		empregado1.setSalarioBase(1045.90);
		empregado1.setImposto(0.08);
		System.out.println("TESTE EMPREGADO");
		empregado1.calcularSalario(empregado1.getSalarioBase(),empregado1.getImposto());
		
	}
}
