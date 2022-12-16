programa{
	funcao inicio(){

		inteiro idade

		escreva("Informe sua idade: ")
		leia(idade)

		se(idade >= 16 e idade < 18){
			escreva("Voto Opicional!\n")
		}
		senao se (idade >= 18 e 	idade <= 69){
			escreva("Voto Obrigatório!\n")
		}
		senao se(idade >= 70){
			escreva("Opicional!\n")
		}
		senao{
			escreva("Não pode votar!\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */