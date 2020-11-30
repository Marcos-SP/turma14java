programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{    //Variaveis
		real custoFabricacao;
          real custoConsumidor;
          const real porcentagemDistribuidor = 28.0;
          const real percentualImpostos = 45.0;
          real destribuidor;
          real ValorImpostos;
		//Entradas de Dado
		escreva ("Qual o custo de fabricação do carro: ")
		leia (custoFabricacao)
		//Processamento
		ValorImpostos = (( custoFabricacao * percentualImpostos )/100);
		destribuidor = ((custoFabricacao + percentualImpostos) * porcentagemDistribuidor) / 100.000;
		custoConsumidor = (destribuidor + ValorImpostos);
		//Saida
		escreva ("O custo do consumidor é ", Matematica.arredondar(custoConsumidor + custoFabricacao , 2));
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 740; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */