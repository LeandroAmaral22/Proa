package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu saldo: ");
		double saldoAtual = sc.nextDouble();
		
		System.out.printf("\nSaldo médio: %.2f", saldoAtual);
		
		double saldoAtualizado = 0;
		double valorCredito = 0;
		
		if(saldoAtual > 500 && saldoAtual <= 1000) {
			saldoAtualizado = saldoAtual * 1.30;
			valorCredito = saldoAtualizado - saldoAtual;
			System.out.printf("\nSaldo com crédito: %.2f", saldoAtualizado);
		}else if(saldoAtual >= 1001 && saldoAtual <= 3000) {
			saldoAtualizado = saldoAtual * 1.40;
			valorCredito = saldoAtualizado - saldoAtual;
			System.out.printf("\nSaldo com crédito: %.2f", saldoAtualizado);
		}else if(saldoAtual >= 3001) {
			saldoAtualizado = saldoAtual * 1.50;
			valorCredito = saldoAtualizado - saldoAtual;
			System.out.printf("\nSaldo com crédito: %.2f", saldoAtualizado);
		}else {
			System.out.println("\nNenhum crédito");
		}
		
		System.out.printf("\nValor crédito %.2f", valorCredito);
		
		sc.close();
	}

}
