package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		
		System.out.print("Informe o valor do IPI: ");
		double ipi = sc.nextDouble();
		
		System.out.print("Código da peça: ");
		int codPeca = sc.nextInt();
		
		System.out.print("Valor unitário da peça: ");
		double valor1 = sc.nextDouble();
		
		System.out.print("Quantidade de peças: ");
		int qtd1 = sc.nextInt();
		
		System.out.print("\nCódigo da peça: ");
		int codPeca2 = sc.nextInt();
		
		System.out.print("Valor unitário da peça: ");
		double valor2 = sc.nextDouble();
		
		System.out.print("Quantidade de peças: ");
		int qtd2 = sc.nextInt();
		
		total = (valor1 * qtd1 + valor2 * qtd2) * (ipi / 100 + 1);
		
		System.out.printf("\nValor total: %.2f", total);
		
		sc.close();
	}

}
