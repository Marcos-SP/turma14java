
public class Cavalo extends Animal{
	protected int correr;

	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
	}

	public int getCorrer() {
		return correr;
	}

	public void setCorrer(int correr) {
		this.correr = correr;
	}
	@Override
	public String somAnimal(String som) {
		return this.getSom();
	}
}
