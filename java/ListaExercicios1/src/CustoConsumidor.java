import java.util.Scanner;

public class CustoConsumidor {
  public static void main(String[] args) {
	final double PorcentagemDoDistribuidor = 0.28;
	final double PorcentagemDosImpostos = 0.45;
	double precoDeFabrica, precoConsumidor;
	Scanner leia = new Scanner(System.in);
	System.out.println("Entre com o pre�o de fabrica: ");
	precoDeFabrica = leia.nextDouble();
	precoConsumidor = precoDeFabrica * (PorcentagemDoDistribuidor + PorcentagemDosImpostos);
	precoConsumidor = precoConsumidor+precoDeFabrica;
	System.out.println("O pre�o do consumidor � :"+precoConsumidor);
	
	
}
}
