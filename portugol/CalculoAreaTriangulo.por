programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	//Variaveis
		real baseTriangulo
		real alturaTriangulo
		real resultado
		//Entrada de Dados
		escreva ("Informe um numeros positivos para a base do triangulo: ")
		leia(baseTriangulo)
		escreva ("Informe um numeros positivos para a altura do triangulo: ")
		leia(alturaTriangulo)
		//Processamento de dados
		resultado = baseTriangulo*alturaTriangulo/2
		//Saida de dados
		se (baseTriangulo>=0 e alturaTriangulo >=0)
		{
			escreva ("O resultado é ", mat.arredondar(resultado, 2))
		}
		senao
		{
			escreva ("Desculpe os valores precisam ser positivos.")
		}
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