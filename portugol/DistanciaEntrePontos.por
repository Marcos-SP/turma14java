programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1, x2, y1, y2, d
		escreva ("\nValor X1: ")
		leia (x1)
		escreva ("\nValor X2: ")
		leia (x2)
		escreva ("\nValor Y1: ")
		leia (y1)
		escreva ("\nValor Y2: ")
		leia (y2)

		d = Matematica.raiz (Matematica.potencia((x2-x1), 2) + Matematica.potencia(y2-y1, 2), 2)
		escreva ("\nA distancia entre os pontos é: ", Matematica.arredondar(d , 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */