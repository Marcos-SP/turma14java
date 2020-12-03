programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{    const inteiro HABITANTES = 20
		real salario
		real numeroFilhos, totalFilhos = 0.0
		real mediaSalario = 0.0, mediaNumeroFilhos = 0.0, maiorSalario = 0.0
		real percentualPessoas100 = 0.0, totalSalario = 0.0
		real conta100=0
		para (inteiro habitantes = 1; habitantes<=HABITANTES; habitantes ++)
		{
			escreva ("Salario: ")
			leia(salario)
			escreva("Numero de filho: ")
			leia(numeroFilhos)
			totalSalario = totalSalario+salario
			totalFilhos = totalFilhos + numeroFilhos
			se(maiorSalario< salario)
			{
				maiorSalario=salario
			}
			se(salario<=100)
			{
				conta100++
			}
			
		}
		mediaSalario= totalSalario/HABITANTES
		mediaNumeroFilhos = totalFilhos/HABITANTES
		percentualPessoas100 =(conta100/HABITANTES)*100
		escreva ("\nMédia salarios ", mat.arredondar(mediaSalario, 2))
		escreva ("\nMédia numeros de filhos ", mediaNumeroFilhos)
		escreva ("\nMaior Salario ",maiorSalario)
		escreva ("\nAté 100 ", mat.arredondar(percentualPessoas100,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */