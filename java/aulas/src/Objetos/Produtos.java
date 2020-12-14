package Objetos;

public class Produtos {
	public String nomeProdutos;
	public int quantidadeProduto;
	public int valorUnitario;
	public Produtos()//COnstrutor Padrao//ConstrutorVazio 
	{
		
	}
	//Sobrecarga
	public Produtos(String nomeProdutos, int quantidadeProduto, int valorUnitario) {
		super(); //depois
		this.nomeProdutos = nomeProdutos;
		this.quantidadeProduto = quantidadeProduto;
		this.valorUnitario = valorUnitario;
	}
	public Produtos(String nomeProdutos, int valorUnitario) {
		this.nomeProdutos=nomeProdutos;
		this.valorUnitario=valorUnitario;
	}
	
}
