programa
{
	inclua biblioteca Matematica-->mat
	/*
	 O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
	Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
	IMC em adultos Condição 
	Abaixo de 18,5 Abaixo do peso 
	Entre 18,5 e 25 Peso normal 
	Entre 25 e 30 Acima do peso 
	Acima de 30 obeso
	 */
	funcao inicio()
	{
		real altura, peso
		real IMC
		escreva("-------IMC-------")
		escreva("\nEscreva peso: ")
		leia(peso)
		escreva("\nEscreav altura: ")
		leia(altura)
		IMC =  peso / mat.potencia(altura, 2)
		escreva("\nSeu IMC é ", mat.arredondar(IMC, 2))
		 se (IMC<=18.5)
		 {
		 	escreva("\nAbaixo do peso")
		 }
		 senao se (IMC>=18.5 e IMC<25)
		 {
		 	escreva("\nPeso normal")
		 }
		 senao se (IMC>=25 e IMC<30)
		 {
		 	escreva("\nAcima do peso")
		 }
		 senao se(IMC>30)
		 {
		 	escreva("\nObeso")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 547; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */