programa
{
	
	funcao inicio()
	{
		cadeia nomeAluno
		inteiro genero, nota
		
		escreva("***Generation Brasil - Nota***\n")
		escreva ("Qual o nome do aluno? ")
		leia (nomeAluno)

		escreva ("Digite como deseja ser tratado: 1[Masculino], 2[Feminino], 3[Outro]")
		leia (genero)

		se (genero == 1)
		{
			escreva ("Olá aluno, " + nomeAluno + ", qual é a sua primeira nota? ")
			leia (nota)
		}
		senao se (genero == 2)
		{
			escreva ("Olá aluna, " + nomeAluno + ", qual é a sua primeira nota? ")
			leia (nota)
		}	
				
		senao 
		{
			escreva ("Olá alunx, " + nomeAluno + ", qual é a sua primeira nota? ")
			leia (nota)
		} 
				
	
		se (nota <= 5)
		{
			escreva ("REPROVADO")
		}
		senao
		{
			escreva ("APROVADO")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */