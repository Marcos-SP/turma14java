programa
{
	
	funcao inicio()
	{
		cadeia disciplinas[4],nome
		inteiro notas[4]
		caracter tipo
		disciplinas[0]= "Portugues"
		disciplinas[1]= "Matematica"
		disciplinas[2]= "Ciencias"
		disciplinas[3]= "Artes"
		
		escreva("\nQual seu genero Feminino(F) ou Masculino(M)")
		leia(tipo)
		se (tipo == 'F' ou tipo == 'f')
		{
		    escreva("\nQual seu nome: ")
		    leia (nome)
		    para(inteiro x=0;x<4; x++)
		    {
		    	 escreva ("\nDisplinas ", disciplinas[x])
		    	 escreva("\nNotas", notas[x])
		    	 leia (notas[x])
		    }
		    
		    
		    	 para(inteiro x=0;x<4; x++)
		    	 {
		    	 	
		    	 	escreva("\n",nome," - ",disciplinas[x]," - ",notas[x])
		    	 }
		    
		 }
		 se (tipo == 'M' ou tipo == 'm')
		{
		    escreva("\nQual seu nome: ")
		    leia (nome)
		    para(inteiro x=0;x<4; x++)
		    {
		    	 escreva ("\nDisplinas ", disciplinas[x])
		    	 escreva("\nNotas", notas[x])
		    	 leia (notas[x])
		    }
		    
		    
		    	 para(inteiro x=0;x<4; x++)
		    	 {
		    	 	
		    	 	escreva("\n",nome," - ",disciplinas[x]," - ",notas[x])
		    	 }
		    
		 }
	}
}	
		


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1076; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */