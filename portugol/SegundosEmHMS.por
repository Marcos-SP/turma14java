programa
{
	inclua biblioteca Matematica
	//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e
	//mostre-o expresso em horas, minutos e segundos.
	
	funcao inicio()
	{ 
		inteiro tempoSegundos, horas, minutos, segundos
		escreva ("Qual o tempo em segundos: ")
		leia (tempoSegundos)
		horas = (tempoSegundos/ 3600)
		minutos = ((tempoSegundos %3600)/60)
		segundos = (tempoSegundos %3600)%60)
		escreva ( "Horas: ", horas, " Minutos: ", minutos, " Segundos: ", segundos)
		escreva ("\n")
		escreva (horas,":",minutos,":",segundos":")
		
		
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