package ModeloDeClasse;

public class Funcionario {
	//Atributos
	private String nome;
	protected int horasMensais;
	protected double valorHora;
	//Construtores
	public Funcionario(String nome, int horasMensais, double valorHora) {
		super();
		this.nome = nome;
		this.horasMensais = horasMensais;
		this.valorHora = valorHora;
	}
	//Encapsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasMensais() {
		return horasMensais;
	}
	public void setHorasMensais(int horasMensais) {
		this.horasMensais = horasMensais;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	//Métodos
	
	public double pagamentoSalario(int horasMensais, double valorHoras) {
		
		return this.horasMensais*this.valorHora;
		
	}
	
	
	
}
