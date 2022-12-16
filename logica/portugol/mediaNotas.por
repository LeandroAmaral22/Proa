programa{
	funcao inicio()
	{
		real n1, n2, n3, media

		escreva("Informe a primeira nota: ")
		leia(n1)

		escreva("Informe o segunda nota: ")	
		leia(n2)

		escreva("Informe o segunda nota: ")	
		leia(n3)

		media = (n1 + n2 + n3) / 3

		escreva("\nMedia = ", media)
		
		se(media >= 6){
			escreva("\nAprovado\n")
		}
		senao se(media >= 5){
			escreva("\nRecuperação\n")
		}
		senao{
			escreva("\nReprovado\n")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 160; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */