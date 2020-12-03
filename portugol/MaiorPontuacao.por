programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//inteiro numeroUsuario
		real valores[6]
		real maiorPontuacao=0.0
		real maiorPontuacao2=0.0
		para (inteiro x=0; x<5; x++)
		{	
			escreva("\nEntre com a ",x+1," pontuação : ")
			leia(valores[x])
			maiorPontuacao=0.0
			se(valores[x]>maiorPontuacao)
			{
				maiorPontuacao=valores[x]
			}
			se(valores[x]>maiorPontuacao2)
			{
				maiorPontuacao2=valores[x]
			}
			
		}
		
		escreva("\nMaior pontuação :", Matematica.maior_numero(maiorPontuacao, maiorPontuacao2))
	}
	
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */