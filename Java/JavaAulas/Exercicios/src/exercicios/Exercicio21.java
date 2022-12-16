package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor da compra: R$ ");
		double valor = sc.nextDouble();
		
		System.out.println();
		for(int i=1; i<=5; i++) {
			double prestacao = valor / 5;
			System.out.printf(i + " prestação %.2f \n", prestacao);
		}
		
		sc.close();
	}

}
