programa
{	/*2) Elabore um sistema que leia as variáveis C e N, 
	*respectivamente código e número de horas trabalhadas de um operário. 
	*E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	*Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E,
	*caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
	*No final do processamento imprimir o salário total e o salário excedente.
	*/
	funcao inicio()
	{
	 //Variaveis
	 real codigo = 0.0
	 real horasTrabalhadas = 0.0
	 real EI= 0.0
	 cadeia nome	
	 //Entrada de dados
	 escreva ("Nome do funcionario: ")
	 leia(nome)
	 escreva ("Quantas horas o funcionario trabalhou: ")
	 leia(horasTrabalhadas)
	 
	 //Processamento
	 	se (horasTrabalhadas<=50)//Horas Trabalhadas
	 		{
	 			escreva("O Funcinario ", nome, ", deve receber de salario ", horasTrabalhadas*10)
	 		}
	 	senao se(horasTrabalhadas>50)//Em caso de hora excedentes
	 		{	
	 			EI=horasTrabalhadas-50//HORAS EXTRA
	 			horasTrabalhadas=horasTrabalhadas-EI//HORAS TRABALHAS
	 			escreva("O Funcinario ", nome, ", deve receber o salario no valor de R$",horasTrabalhadas*10.0, ", em um extra de R$",EI*20)
	 			escreva("\nTotalizando, R$",(EI*20)+(horasTrabalhadas*10))//HORAS TRABALHADAS + EXCEDENTES
	 		}
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1185; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */