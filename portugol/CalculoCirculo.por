programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real area
		const real pi = 3.14
		real raio
		escreva ("Qual o raio do circulo?")
		leia (raio)

		area = pi*mat.potencia(raio,2)
		escreva("A area do circulo é : ", pi*mat.potencia(raio,2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */