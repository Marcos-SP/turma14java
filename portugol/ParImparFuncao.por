programa
{
	
	funcao inicio()
	{
		inteiro numero
		linha()
		pula()
		escreva("Digite o numero ")
		leia(numero)
		parimpar(numero)
		pula()
		escreva(voltaParImpar(134))
		//parimpar(100)
		se (voltaParImpar(numero) == "Impar")
		{
			escreva("Voce digitiu um numero impar")
		}
		senao
		{
			escreva("\nÉ PAR")
			pula()
		}
	}
	funcao cadeia voltaParImpar(inteiro numero)
	{
		cadeia tipo
		se((numero%2) == 0)
		{
			tipo = "Par"
			pula()
		}
		senao
		{
			tipo = "Impar")
		}
		retorne tipo
		
	}

	funcao parimpar(inteiro numero)//subprograma
	{
		se((numero%2) == 0)
		{
			escreva("Valor par")
		}
		senao
		{
			escreva("Valor impar")
		}
	}
	funcao linha()
	{
		escreva("-------------------")
	}
	funcao pula()
	{
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */