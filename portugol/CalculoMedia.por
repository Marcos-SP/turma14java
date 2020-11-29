programa
{
	inclua biblioteca Matematica
	//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
	
	funcao inicio()
	{
		real notaUm, notaDois, notaTres, notaFinal
		escreva ("Nota 1: ")
		leia (notaUm)
		escreva ("Nota 2: ")
		leia (notaDois)
		escreva ("Nota 3: ")
		leia (notaTres)
		notaUm = notaUm*2
		notaDois = notaDois*3
		notaTres = notaTres*5
		notaFinal = (notaUm + notaDois + notaTres)/10
		escreva ("A média final do aluno é : ", Matematica.arredondar(notaFinal, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */