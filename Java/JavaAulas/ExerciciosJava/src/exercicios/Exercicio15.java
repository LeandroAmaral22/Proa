package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i=1; i<=20; i++) {
			System.out.print("Informe o " + i + "º número: ");
			int idade = sc.nextInt();
			
			soma += idade;
		}
		
		System.out.println("\nSoma das idades informados: " + soma);
		
		sc.close();

	}

}
