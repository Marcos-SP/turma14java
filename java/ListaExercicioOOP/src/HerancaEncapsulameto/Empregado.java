package HerancaEncapsulameto;

public class Empregado extends Pessoa {
	//ATRIBUTOS  // seletores e modificadores SET E GET
	protected int codigoSetor;
	protected double salarioBase;
	protected double imposto ;

	//Construtores
	
	public Empregado(String nome, String endereço, String telefone, int codigoSetor, double salarioBase,
			double imposto) {
		super(nome, endereço, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public Empregado() {
		
	}
	public Empregado(double salarioBase, double imposto) {
		super();
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	//Encapsulameto
	public int getCodigoSetor() {
		return codigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	//Métodos
	public void calcularSalario(double salarioBase, double imposto) {
		this.salarioBase=this.salarioBase-(this.imposto*this.salarioBase);
		System.out.printf("Salario: %.2f ",this.salarioBase);
	}
	
}
