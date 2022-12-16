package javabasico;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double notas = 0;
		double soma = 0;
		
		for(int i=1; i<=4; i++) {
			System.out.print("Informe a " + i + "° nota: ");
			notas = sc.nextDouble();
			soma += notas;
		}
		
		double media = soma / 4;
		
		System.out.println();
		System.out.printf("Média: %.2f", media);
		
		sc.close();
	}

}
