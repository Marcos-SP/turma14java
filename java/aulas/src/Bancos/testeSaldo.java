package Bancos;

import java.util.Scanner;



public class testeSaldo {
 public static void main(String[] args) {
	//Conta conta1 = new Conta(); Generaliza para não usar, conta não pode ser usada pois é abstrata
	Scanner l = new Scanner(System.in);
	double valorCredito;
	double valorDebito;
	/*System.out.println("Numero de conta");
	int conta = l.nextInt();
	ContaPoupanca pop1 = new ContaPoupanca(conta,"111",25);
	*/
	ContaPoupanca pop = new ContaPoupanca(112,"111",25);//Eu que defino oq vai entrar aqui
	System.out.println(pop.getNumeroConta());
	System.out.println("Saldo : "+pop.getSaldo());
	System.out.println("Credito");
	valorCredito = l.nextDouble();
	pop.credito(valorCredito);
	System.out.println("Devito: ");
	valorDebito = l.nextDouble();
	pop.debito(valorDebito);
	System.out.println(pop.getSaldo());
	
	
}
}
