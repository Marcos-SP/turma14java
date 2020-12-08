import java.util.Scanner;
import java.text.DecimalFormat;
public class FahrenheitEmCelsius {
  public static void main(String[] args) {
	double grausCelsius;
	double grausFahrenheit;
	DecimalFormat df = new DecimalFormat("#.00");
	Scanner leia = new Scanner(System.in);
	System.out.println("Qual a temperatura em Fahrenheit: ");
	grausFahrenheit = leia.nextDouble();
	grausCelsius = ( grausFahrenheit - 32 ) / 1.8;
	System.out.println("Temperatura em Celsius: "+ df.format(grausCelsius)+ "C");
}
}
