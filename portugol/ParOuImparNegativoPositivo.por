programa
{
	
	funcao inicio()
	{    
		//Variaveis
		inteiro numero
		//Entrada
		escreva("Escreva um numero: ")
		leia (numero)
		//Processamento de dados
		se (numero %2 == 0)
			{
				escreva("O numero é par")
			} 
		senao
			{
				escreva("O numero é impar")
			}
		se (numero == 0 )
	 		{
	 	     	escreva("\nO numero é neutro")
	 		}
	 	senao se (numero>0)
	 		{
	 			escreva (", e positivo.")
	 		}
	 	senao se (numero<0)
	 		{
	 			escreva (", e  negativo.")
	 		}
	     
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */