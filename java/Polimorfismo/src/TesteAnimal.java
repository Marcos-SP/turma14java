import java.util.Scanner;

public class TesteAnimal {
 public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("-------TESTE ANIMAL-------");
	Cachorro dog = new Cachorro("Whisky",9,"AUAU");
	Cavalo horse = new Cavalo("Peter",6,"hiin in in hinir");
	Preguica pregu = new Preguica("Sono",2,"WIIIIIIIIIIIIILLL");
	System.out.println("SOM DOS ANIMAIS");
	System.out.println("[C]Cachorro");
	System.out.println("[V]Cavalor");
	System.out.println("[P]Preguiça");
	char op = leia.next().toUpperCase().charAt(0);
	if(op == 'C') {
		System.out.printf(dog.getSom());
	}
	if(op == 'V') {
		System.out.println(horse.getSom());
	}
	if(op == 'P') {
		System.out.println(pregu.getSom());
	}
	else {
		System.out.println("");
	}
}
}
