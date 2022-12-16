package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int soma = 0;

		while (num >= 0) {
			System.out.print("Digite um número inteiro: ");
			num = sc.nextInt();
			if(num > 0) {
				soma += num;
			}
			
		}
		
		System.out.println("\nSoma:" + soma);

		sc.close();
	}

}
