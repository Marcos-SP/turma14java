programa
{
	
	
	funcao inicio()
	{
		inteiro conta =001
		inteiro saldo=0
		inteiro emprestimoEmpresa
		inteiro cpf = 5
		caracter tipo 
		inteiro saldoCredito[10]
		inteiro somaCredito[10]
		inteiro somaDebito[10]
		caracter status = 'S'
		caracter emprestimo
		inteiro maximoEmprestimo = 5000
		inteiro valor
		escreva ("Entre com o numero da sua conta: ", conta)
		escreva ("\nSeu CPF: ", cpf)
		escreva ("\nBem vindo ao G6B")
		
		faca
		{
			para(inteiro x=0;x<10;x++)
			{
			
			escreva ("\nOque voce deseja Credita[C] ou Debitar[D]")
			leia (tipo)
			se(tipo =='C' ou tipo == 'c')
				{
				escreva ("\nQual valor deseja creditar no ","[",x,"]", "dia: ")
			
				leia(somaCredito[x])
				enquanto(somaCredito[x]<0)
				{
					escreva ("\nValor invalido.Qual valor deseja creditar no ","[",x,"]", "dia: ")
					leia(somaCredito[x])
				}
				saldo=saldo+somaCredito[x]
				
			}
			senao se (tipo =='D' ou tipo == 'd')
			{
				escreva ("\nQual valor deseja debitar no ","[",x,"]", "dia: ")
				leia(somaDebito[x])	
				enquanto(somaDebito[x]<0)
				{
					escreva ("\nValor invalido.Qual valor deseja debitar no ","[",x,"]", "dia: ")
					leia(somaDebito[x])
				}
					saldo=saldo-somaDebito[x]
			}
			    
			}
			 escreva("\nSeu saldo é"," R$ ", saldo)
			
		
		}    
			enquanto(saldo>maximoEmprestimo)
		
			escreva("\nVoce deseja realixar um emprestimo S/N?")
			leia(emprestimo)
			
			se (emprestimo=='s' ou emprestimo =='S')
			{
			escreva("Qual o valor ?")
			leia(valor)
			enquanto (valor >maximoEmprestimo)
				{
						escreva("Valor invalido.Qual o valor ?")
					}
				//maximoEmprestimo=maximoEmprestimo-valor
				//saldo=saldo+valor
				escreva("Seu novo saldo é"," R$ ", saldo+valor)
			}
			senao 
			{
				escreva("\nMuito Obrigado por usar o G6B")
			}
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */