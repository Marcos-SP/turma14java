programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real grausCelsius		
		real grausFahrenheit
		escreva ("Qual a temperatura em Fahrenheit: ")
		leia (grausFahrenheit)
		
		grausCelsius = ( grausFahrenheit - 32 ) / 1.8
		escreva ("Temperatura em Celsius: "+ Matematica.arredondar(grausCelsius, 2) + "C")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */