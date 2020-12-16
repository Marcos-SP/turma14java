package ModeloDeClasse;

public class Terceiro extends Funcionario {
	private double valorTerceiro;
	

	public Terceiro(String nome, int horasMensais, double valorHora, double valorTerceiro) {
		super(nome, horasMensais, valorHora);
		this.valorTerceiro = valorTerceiro;
	}
	//Construtor e Classe tem o mesmo nome

	public double getValorTerceiro() {
		return valorTerceiro;
	}

	public void setValorTerceiro(double valorTerceiro) {
		this.valorTerceiro = valorTerceiro;
	}
	
	
	@Override
	public double pagamentoSalario(int horasMensais, double valorHoras) {
		
		return (super.getValorHora()*super.getHorasMensais())+valorTerceiro;
				
	}
}
