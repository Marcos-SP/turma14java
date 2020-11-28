programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro DIASDOANO = 365
		inteiro DIASMESES = 30
		inteiro anoNascimento
		inteiro mesNascimento
		inteiro diaNascimento
		escreva ("Para sabermos quantos dias voce tem vivo na terra")
		escreva ("\n")
		escreva ("Informe sua idade em ")
		escreva ("\n")
		escreva ("Anos :")
		leia (anoNascimento)
		escreva ("Meses :")
		leia (mesNascimento)
		escreva ("Dias :")
		leia (diaNascimento)
		
		//dias + (anoNascimento * DIASDOANO) + (mesNascimento * DIASMESES)
		escreva ("Voce tem ", diaNascimento + (anoNascimento * DIASDOANO) + (mesNascimento * DIASMESES)," dias na terra")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */