programa
{
	
	funcao inicio()
	{
		cadeia nome, endereco, estado, opcaoDoenca
		inteiro idade, qtdDependestes, tempoEmpresa, cep
		real salario

		escreva("SISTEMA DE SEGURO DE SAÚDE\n")
		escreva("\nInforme o nome: ")
		leia(nome)
		escreva("Informe a idade: ")
		leia(idade)

		escreva("Informe o número de dependentes: ")
		leia(qtdDependestes)
		escreva("Informe o endereço: ")
		leia(endereco)
		escreva("Informe o CEP: ")
		leia(cep)
		escreva("Informe o Estado (UF): ")
		leia(estado)
		escreva("Informe o tempo de empresa: ")
		leia(tempoEmpresa)
		escreva("Informe o salário: ")
		leia(salario)
		escreva("Tem Doenças pré-existentes? SIM ou NÃO: ")
		leia(opcaoDoenca)


		escreva("\nDADOS DO CLIENTE\n")
		escreva("\nNome: ", nome, "\nIdade: ", idade, "\nQuantidade de Dependentes: ", qtdDependestes, "\nEndereço: ", endereco, "\nCEP: ", cep, "\nEstado: ", 
		estado, "\nTempo de Empresa: ", tempoEmpresa, "\nSalário: ", salario,"\nDença pré-existente: ", opcaoDoenca)

		escreva("\n\nRELATÓRIO\n")
		
		se(idade < 18){
			escreva("\nPrecisa ser maior de idade!")
		}
		se(estado == "SP" ou estado =="São Paulo"){
			escreva("\nO Seguro tem cobertura para a regiâo!")
		}senao{
			escreva("\nO plano não tem cobertura do Seguro para outros estados!")
		}
		se(tempoEmpresa < 2){
			escreva("\nO plano não tem cobertura para tempo de empresa menor que 2 anos!")
		}
		se(salario >= 3000){
			escreva("\nSeguro Gold")
		}senao se(salario >= 1500 e salario < 3000){
			escreva("\nSeguro Platinum!")
		}senao{
			escreva("\nO plano não tem cobertura do seguro saúde para salários menor que R$ 1500,00!")
		}

		se(opcaoDoenca == "Sim" ou opcaoDoenca =="SIM" ou opcaoDoenca == "s"){
			escreva("\nSujeito à analise do corpo médico da empresa")
		}

		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1082; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */