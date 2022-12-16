programa{
	funcao inicio(){


		cadeia nome, estadoCivil
		inteiro idade, qtdFilhos, tempoEmpresa
		real salario

		escreva("Informe seu nome: ")
		leia(nome)
		escreva("Informe sua idade: ")
		leia(idade)
		escreva("Informe seu estado civil: ")
		leia(estadoCivil)
		escreva("Informe a quantidade de filhos: ")
		leia(qtdFilhos)
		escreva("Informe o tempo de empresa: ")
		leia(tempoEmpresa)
		escreva("Informe seu salário: ")
		leia(salario)

		escreva("\n")

		se(idade > 60){
			escreva("Apresentar plano de aposentadoria para o funcionário\n")
		}senao{
			escreva("Sem plano de aposentadoria! \n")
		}
		se(qtdFilhos > 0){
			escreva("Funcionario com direito ao Auxilio Familia\n")
		}senao{
			escreva("Funcionario sem direito ao Auxilio Familia\n")
		}
		
		se(tempoEmpresa > 5){
			escreva("Funcionário com direito a abono Salarial\n")
		}senao{
			escreva("Funcionário não tem direito a abono Salarial\n")
		}

		se(salario > 4300){
			escreva("Funcionário com direito ao Seguro de Vida e Seguro Saúde\n")
		}senao{
			escreva("Funcionário sem direito ao Seguro de Vida e Seguro Saúde\n")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */