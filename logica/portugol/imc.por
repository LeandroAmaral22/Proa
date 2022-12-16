programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio(){
	
	real peso , altura , imc
 
     escreva("Informe seu peso: ")
     leia(peso)

     escreva("Informe sua altura: ")
     leia(altura)

     imc = peso / (altura * altura) 
     escreva("IMC = ", mat.arredondar(imc, 2), "\n")

     escreva("\nSituação: ")
     se(imc <= 18.5){
     	escreva("Abaixo do Peso\n")
	}senao se(imc > 18.5 e imc <= 24.9){
		escreva("Peso Normal\n")
	}
	senao se(imc >= 25 e imc <= 29.9){
		escreva("Sobrepeso\n")
	}
	senao se(imc >= 30 e imc <= 34.9){
		escreva("Obesidade Grau I\n")
	}
	senao se(imc >= 35 e imc <=39.9){
		escreva("Obesidade Grau II\n")
	}
	senao{
		escreva("\nObesidade Grau III\n")
	}
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */