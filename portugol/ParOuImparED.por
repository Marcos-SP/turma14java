programa
{
	
	funcao inicio()
	{
		//Variaveis
		inteiro numero
		escreva("Digite um numeor positivo inteiro")
		leia (numero)
		
		se (numero == 0){
			escreva ("Numero negativo")
		}
		senao{
			se ((numero %2)== 0) {
				escreva("O numero digitado é par")
			}
			senao 
			{
		     	escreva("O numero é impar")
			}
		}
	}
}  
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */