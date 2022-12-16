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
			System.out.print("Informe o " + i + "� n�mero: ");
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				System.out.println("Este n�mero � PAR!");
				contPar += 1;
			}else {
				System.out.println("Este n�mero IMPAR!");
				contImpar += 1;
			}
		}
		
		System.out.println("\nQuantidade de n�meros pares: " + contPar);
		System.out.println("Quantidade de n�meros �mpares: " + contImpar);

	}

}
