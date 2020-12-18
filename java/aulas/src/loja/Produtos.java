package loja;

public class Produtos {
	// Atributos
	protected String nomeProdutos;
	protected String codigo;
	protected int quantidadeProduto;
	protected long precoUnitario;
	// Construtores

	public Produtos(String nomeProdutos, int quantidadeProduto, long precoUnitario) {
		super(); // depois
		this.nomeProdutos = nomeProdutos;
		this.quantidadeProduto = quantidadeProduto;
		this.precoUnitario = precoUnitario;
	}

	public Produtos(String nomeProdutos, String codigo, int quantidadeProduto, long precoUnitario) {
		super();
		this.nomeProdutos = nomeProdutos;
		this.codigo = codigo;
		this.quantidadeProduto = quantidadeProduto;
		this.precoUnitario = precoUnitario;
	}

	public Produtos(String nomeProdutos, String codigo, long precoUnitario) {
		super();
		this.nomeProdutos = nomeProdutos;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
	}

	// ENC
	public Produtos(String nomeProdutos, long valorUnitario) {
		this.nomeProdutos = nomeProdutos;
		this.precoUnitario = valorUnitario;
	}

	public String getNomeProdutos() {
		return nomeProdutos;
	}

	public void setNomeProdutos(String nomeProdutos) {
		this.nomeProdutos = nomeProdutos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(long precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	// Metodos
	public void tirarEstoque(int saida) {
		if (testarEstoque(saida)) {
			this.quantidadeProduto -= saida;
		} else {
			System.out.println("INDIPONIVEL");
		}
	}

	public void adicionaEstoque(int entrada) {
		this.quantidadeProduto += entrada;
	}

	public boolean testarEstoque(int valor) {

		if (valor > quantidadeProduto) {
			return false;
		} else if (valor == 0) {
			return false;
		} else if (quantidadeProduto == 0) {
			return false;
		} else if (quantidadeProduto < 0) {
			return false;
		} else {
			return true;
		}
	}

	public double venda(int qtdeVendida) {
		if(testarEstoque(qtdeVendida)) {
		tirarEstoque(qtdeVendida);
		return qtdeVendida * this.precoUnitario;
		}
		else {
			System.out.println("VendaNEGADA");
			return 0;
		}
	}

}