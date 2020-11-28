programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real grausCelsius		
		real grausFahrenheit
		escreva ("Qual a temperatura em Celsius: ")
		leia (grausCelsius)
		
		grausFahrenheit = ( grausCelsius * 1.8 ) + 32 
		escreva ("Temperatura em Fahrenheit: "+ Matematica.arredondar(grausFahrenheit, 2) + "F")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */