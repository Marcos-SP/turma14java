package BancoFinal;

public abstract class Conta {
	private String cpfConta;
	private double saldoConta = 0.0;
	private int numConta;

	public Conta(int numConta) {
		super();
		this.numConta = numConta;
	}

	public Conta(int numConta, String cpfConta) {
		super();
		this.cpfConta = cpfConta;
		this.numConta = numConta;
	}

	public String getCpfConta() {
		return cpfConta;
	}

	public void setCpfConta(String cpfConta) {
		this.cpfConta = cpfConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double mostraSaldo() {
		return this.saldoConta;
	}

	public void depositar(double valor) {
		this.saldoConta = this.saldoConta + valor;
	}

	public void retirar(double valor) {
		if(testarSaldo(valor)) {
			this.saldoConta = this.saldoConta - valor;
		}
		else {
			System.out.println("Saldo indisponível!");
		}
	}
	
	public boolean testarSaldo(double valor) {
        boolean teste;
        if (valor <=this.saldoConta) {
            teste = true;
        }
        else {
            teste = false;
        }
        return teste;
    }

}