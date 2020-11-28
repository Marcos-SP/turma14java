programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real A, B, C, D, R, S
		//real B
		//real C
		//real D
		//real R = Matematica.potencia(A + B, 2)
		//real S = Matematica.potencia(B + C, 2)
	     escreva("Calculo da expressão D = R+S/2, onde R=(A+B)2, S=(B+C)2")
	     escreva ("\nValor A = ")
	     leia (A)
	     escreva ("\nValor B = ")
	     leia (B)
	     escreva ("\nValor C = ")
	     leia (C)
		R = Matematica.potencia(A + B, 2)
		S = Matematica.potencia(B + C, 2)
	     
	     escreva ("\nValor R: ", Matematica.potencia(A + B, 2))
	     escreva ("\nValor S: ", Matematica.potencia(B + C, 2))
	     escreva ("\nValor D: ", D = R + S/2)
	        
	     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */