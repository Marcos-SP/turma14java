
public class Cachorro extends Animal {
	protected String correr;
	
	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
	
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	@Override
	public String somAnimal(String som) {
		return super.getSom();
	}
	
}
