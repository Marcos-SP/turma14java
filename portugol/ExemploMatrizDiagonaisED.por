programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro TAMANHO = 3
		inteiro matriz[TAMANHO][TAMANHO]
		inteiro linha, coluna
		inteiro totalNumeros=0, totalDiagonal=0
		
		
		para (linha = 0; linha < TAMANHO; linha++) // aqui o giro das linhas
		{
			para (coluna = 0; coluna < TAMANHO; coluna++)  //aqui é o giro da coluna
			{
				//aqui é onde vc grava, apagar, mexer nos dados
				escreva("Digite o valor da posição: [",linha,"][",coluna,"]")
				leia(matriz[linha][coluna])
				totalNumeros = totalNumeros + matriz[linha][coluna]
				se (linha == coluna)
				{
						//totalDiagonal = totalDiagonal + matriz[linha][coluna]
						totalDiagonal += matriz[linha][coluna]
						
				}	
			}
			escreva("\n")
		}
		escreva("\nMATRIZ ATUAL\n")
		para (linha = 0; linha < TAMANHO ; linha++)
		{
			para (coluna = 0; coluna < TAMANHO; coluna++)
			{
				escreva(matriz[linha][coluna]," ")		
			}
			escreva("\n")
		}
		
		
		escreva("\nTotal de valores é:", totalNumeros)
		escreva("\nTotal da diagonal é:", totalDiagonal)
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1055; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */