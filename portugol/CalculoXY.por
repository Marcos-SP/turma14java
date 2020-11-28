programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real a, b, c, d, ei, f
		real x, y
		escreva ("\nQual o valor de A: ")
		leia (a)
		escreva ("\nQual o valor de B: ")
		leia (b)
		escreva ("\nQual o valor de C: ")
		leia (c)
		escreva ("\nQual o valor de D: ")
		leia (d)
		escreva ("\nQual o valor de E: ")
		leia (ei)
		escreva ("\nQual o valor de F: ")
		leia (f)
		x = (c*ei - b *f) / (a*ei - b*d)
		y = (a*f - c*d) / (a*ei - b*d)
		escreva ("\nO valor de X é: ", Matematica.arredondar(x, 2))
		escreva ("\nO valor de Y é: ", Matematica.arredondar(y, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */