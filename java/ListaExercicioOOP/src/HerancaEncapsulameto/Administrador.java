package HerancaEncapsulameto;

public class Administrador extends Pessoa {
	//Atributos
	protected double ajudaDeCusto;
	//Construtores

	public Administrador(String nome, String endereço, String telefone, double ajudaDeCusto) {
		super(nome, endereço, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public Administrador(String nome, String endereço, String telefone) {
		super(nome, endereço, telefone);
	}
	public Administrador() {
		super();
	}
	
	
	//Encapsulamento
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	//Metodos
	public double ajudaViagens(double ajudaDeCusto) {
		double ajuda = ajudaDeCusto;
		
		return ajuda;
		
	}
	
	
}
