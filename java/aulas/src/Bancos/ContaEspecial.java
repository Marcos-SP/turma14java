package Bancos;

public class ContaEspecial extends ContaCorrente 
{
	public double valorLimite;
	
	public ContaEspecial(int numeroConta, double valorLimite) {
		super(numeroConta);
		this.valorLimite = valorLimite;
	}

	

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	@Override
	public boolean testarSaldo(double valor) {
		boolean teste;
		if (valor <=super.getSaldo()) {
			teste = true;
		}
		else if(valor <= (valorLimite+super.getSaldo())){
			double novoValor;
			
			teste = true;
		}
		else {
			teste = false;
		}
		return teste;
	}
}
