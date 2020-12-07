programa
{	
	/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. 	 
	Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
	Código Condição de pagamento 
	1 À vista em dinheiro ou cheque, recebe 20% de desconto 
	2 À vista no cartão de crédito, recebe 15% de desconto 
	3 Em duas vezes, preço normal de etiqueta sem juros 
	4 Em três vezes, preço normal de etiqueta mais juros de 10%
	*/
	
	funcao inicio()
	{	real valor=0.0
		inteiro tipo
		real dinheiroCheque=0.0, aVistaCredito=0.0, duasVezes=0.0,tresVezes=0.0
		real juros = 0.1
		escreva ("Digite o valor do produto: ")
		leia(valor)
		escreva("\n--------Digite a forma de pagamento-------")
		escreva("\n[1] - À vista em dinheiro ou cheque, recebe 20% de desconto")
		escreva("\n[2] - À vista no cartão de crédito, recebe 15% de desconto ")
		escreva("\n[3] - Duas vezes sem juros")
		escreva("\n[4]- Em três vezes, com juros de 10% \n")
		leia(tipo)
		enquanto (tipo<1 ou tipo>4)
		{
		 	escreva("\nForma de pagamento invalida.Digite uma forma de Pagamento")
		 	leia(tipo)
		 	
		}
		se(tipo == 1)
		{
			dinheiroCheque= valor-0.20
			escreva("\nA vista ou em cheque o valor fica:",valor)
		}
		senao se(tipo == 2)
		{
			escreva("\nO valor era ",valor)
			aVistaCredito=valor-0.15
			escreva("\nAgora o valor com disconto  é: ",valor)
		}
		senao se(tipo == 3)
		{
			escreva("\nO valor era ",valor)
			duasVezes=valor/2
			escreva("\nSerão duas parcelas no valor de : ",duasVezes)
		}
		senao se(tipo == 4)
		{
			escreva("\nO valor era ",valor)
			tresVezes=valor+(valor*juros*3)
			escreva("\nSerao três parcelas no valor de:",tresVezes)
		}
		
			
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */