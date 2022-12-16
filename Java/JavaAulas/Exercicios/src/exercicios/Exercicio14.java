package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("Informe o " + i + "º número: ");
			double num = sc.nextDouble();
			
			soma += num;
		}
		
		System.out.printf("Soma dos números informados: %.2f", soma);
		sc.close();
	}

}
