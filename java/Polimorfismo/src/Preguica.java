
public class Preguica extends Animal {
	protected int subirArvore;

	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);
		
	}

	public int getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(int subirArvore) {
		this.subirArvore = subirArvore;
	}
	@Override
	public String somAnimal(String som) {
		return this.getSom();
	}
}
