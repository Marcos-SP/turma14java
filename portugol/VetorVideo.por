programa
{
	
	funcao inicio()
	{
		inteiro numeros[4],x

		para(x=0;x<4;x++)
		{	
			escreva("entre com um numero: ")
			leia(numeros[x])		
		}
		para(x=0;x<4;x++)
		{	
			escreva("\nvalor posição ", x+1,":", numeros[x])		
		}
		para(x=3;x>=0;x--)
		{	
			escreva("\nvalor posição ", x+1,":", numeros[x])
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 197; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */