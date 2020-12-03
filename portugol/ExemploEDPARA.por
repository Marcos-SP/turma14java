programa
{
	
	funcao inicio()
	{
		cadeia nomeAluno
		real notaAluno =0
		real somaNota = 0
		real acimaCinco = 0
		real maiorNota = 7
		para(inteiro indice = 1; indice<=4; indice ++)
		{
			escreva("Nome aluno","[",indice,"]",":")
			leia(nomeAluno)
			escreva("Nota aluno ")
			leia(notaAluno)
			somaNota = somaNota+notaAluno
			se(notaAluno >= 5)
			{
				acimaCinco++
			}
			se(notaAluno > maiorNota )
			{
				maiorNota = notaAluno
			}
		}
		escreva("\nAluno com media acima de cinco", acimaCinco)
		escreva("\nNotas maiores", maiorNota)
		escreva("\nA media da sala é ", somaNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 533; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */