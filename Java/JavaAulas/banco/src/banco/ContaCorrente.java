package banco;

//import java.util.*; //trazer a classe Scanner ou outras que forem necessário
import java.util.Random;
import java.util.Scanner;

public class ContaCorrente {

	int numeroConta;
	String titularConta;
	double saldo;
	int contSaques; // contador que vai limitar a qtde de saques

	Scanner sc = new Scanner(System.in); // instância da classe Scanner

	public ContaCorrente(String titularConta, double saldo) {
		this.titularConta = titularConta;
		this.saldo = saldo;
		this.contSaques = 0;

		Random gerador_numero = new Random();
		numeroConta = gerador_numero.nextInt(1000);
	}

	public void VerSaldo() {
		System.out.println(
				"Número da conta: " + this.numeroConta + "\nTitular: " + this.titularConta + "\nSaldo: " + this.saldo);
	}

	public void Saque(double valorSaque) {
		if (this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			System.out.printf("Saldo atual: %.2f", this.saldo);
			this.contSaques += 1;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	public void Depositar(double valorDeposito) {
		if (valorDeposito > 0) {
			this.saldo += valorDeposito;
			System.out.println("Saldo atualizado: " + this.saldo);
		} else {
			System.out.println("Depositar valor acima de 0");
		}
	}

	public void Iniciar() {

		int opcao;

		do {
			ExibirMenu();
			opcao = sc.nextInt();
			EscolherOpcao(opcao);
		} while (opcao != 4);

	}

	public void EscolherOpcao(int opcao) {
		double saque;
		double deposito;

		switch (opcao) {
		case 1:
			VerSaldo();
			break;
		case 2: 
			if(this.contSaques > 3) {
				System.out.println("Limite exedido de saques!");
			}else {
				System.out.print("Informe o valor de saque: ");
				saque = sc.nextDouble();
				Saque(saque);
			}
			break;
		case 3:
			System.out.print("Informe o valor de depósito: ");
			deposito = sc.nextDouble();
			Depositar(deposito);
			break;
		case 4:
			System.out.println("Fim da execução");
			break;
		default:
			System.out.println("Opção Inválida");
		}
	}

	public void ExibirMenu() {
		System.out.println("\nBem vindo ao banco");
		System.out.println(
				"Escolha uma opção de operação: \n1 - Consultar saldo \n2 - Sacar \n3 - Depositar \n4 - Finalizar");
	}

}
