
public class Cliente {
	public String name;
	public int age;
	public char sex;
	public int money;
	public int anoNascimento;
	
	public Cliente() {
		
	}

	public Cliente(int money){
		this.money=money;
	}
	public void retornaidade() {
		this.age=2020-this.anoNascimento;
	}
}
