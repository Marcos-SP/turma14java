package Bancos;

public class ContaEspecial extends ContaCorrente 
{
	public double valorLimite;
	

	public ContaEspecial(double valorLimite) {
		super();
		this.valorLimite = valorLimite;
	}
	

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
}
