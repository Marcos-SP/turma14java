import java.util.Scanner;
import java.text.DecimalFormat;
public class farenheitEmCelsius {
  public static void main(String[] args) {
	double grausCelsius;
	double grausFahrenheit;
	DecimalFormat df = new DecimalFormat("#.00");
	Scanner leia = new Scanner(System.in);
	System.out.println("Qual a temperatura em Celsius: ");
	grausCelsius = leia.nextDouble();
	grausFahrenheit = ( grausCelsius * 1.8 )+32;
	System.out.println("Temperatura em Celsius: "+ df.format(grausFahrenheit)+ "C");
}
}