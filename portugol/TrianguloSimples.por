programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	//Variaveis
		real baseTriangulo = 0.0
		real alturaTriangulo = 0.0
		real resultado = 0.0
		//Entrada de Dados
		escreva ("Informe um numero para a base do triangulo: ")
		leia(baseTriangulo)
		escreva ("Informe um numero para a altura do triangulo: ")
		leia(alturaTriangulo)
		//Processamento de dados
		se (alturaTriangulo>0 e baseTriangulo>0)
			{
		 	resultado = (baseTriangulo*alturaTriangulo)/2
			escreva ("A área do triangulo é: ", mat.arredondar(resultado,2))
			}
		senao
		{
			escreva("Os valores precisam ser positivos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */