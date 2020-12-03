programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//inteiro numeroUsuario
		real valores[11]
		real ValoresGuardados[11]
		real maiorPontuacao=0.0
		real maiorPontuacao2=0.0
		para (inteiro x=0; x<10; x++)
		{	
			escreva("\nEntre com a ",x+1," pontuação : ")
			leia(valores[x])
			
	
		}
		para(inteiro x=0; x<10; x++)
		{
			escreva(valores[x])
			
		
		se(valores[x]>maiorPontuacao)
			{
				maiorPontuacao=valores[x]
			}
			se(valores[x]>maiorPontuacao2)
			{
				maiorPontuacao2=valores[x]
			}
		}
		escreva("\nA media dos valores é :",Matematica.arredondar(((valores[1]+valores[2]+valores[3]+valores[4]+valores[5]+valores[6]+valores[7]+valores[8]+valores[9]+valores[10])/9),2))
		escreva("\nMaior pontuação :", Matematica.maior_numero(maiorPontuacao, maiorPontuacao2))
	}
	
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */