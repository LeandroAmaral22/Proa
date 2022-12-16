package lacos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contPar = 0;
		int contImpar = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("Informe o " + i + "° número: ");
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				System.out.println("Este número é PAR!");
				contPar += 1;
			}else {
				System.out.println("Este número IMPAR!");
				contImpar += 1;
			}
		}
		
		System.out.println("\nQuantidade de números pares: " + contPar);
		System.out.println("Quantidade de números ímpares: " + contImpar);

	}

}
