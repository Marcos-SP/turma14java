programa
{
	
	funcao inicio()
	{
		real custoFabrica;
          real custoConsumidor;
          real porcentagemDistribuidor = 28.0;
          real percentualImpostos = 45.0;
          real destribuidor;
          real ValorImpostos;
		escreva ("Qual o custo de fabricação do carro: ")
		leia (custoFabrica)

		ValorImpostos = (( custoFabrica * percentualImpostos )/100);
		destribuidor = ((custoFabrica + percentualImpostos) * porcentagemDistribuidor) / 100.000;
		custoConsumidor = (destribuidor + ValorImpostos);
		escreva ("O custo do consumidor é ", custoConsumidor);
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 96; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */