programa{
	funcao inicio()
	{
	
	cadeia cor
	
	escreva("Qual cor está o semáforo?\n")
	escreva("Digite 'vemelho' ou 'amarelo' ou 'verde': ")
	leia(cor)
	
	se (cor == "vermelho" ou cor == "VERMELHO"){
		escreva("\nPARE!\n")
	}senao se(cor == "amarelo" ou cor == "AMARELO"){
		escreva("\nATENÇÂO\n")
	}
	senao se(cor == "verde" ou cor == "VERDE"){
		escreva("\nSIGA EM FRENTE\n")
	}
	senao{
		escreva("\nDigite uma cor valida do semáfaro!\n")
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 157; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */