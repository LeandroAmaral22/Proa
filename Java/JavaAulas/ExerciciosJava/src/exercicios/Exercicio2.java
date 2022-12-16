package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		
		if(num % 10 == 0 && num % 5 == 0 && num % 2 == 0) {
			System.out.println("Ele é dividível por 10, 5, 2!");
		}else if(num % 5 == 0 ) {
			System.out.println("Ele é dividível por 5!");
		}else if(num % 2 == 0) {
			System.out.println("Ele é dividível por 2!");
		}else {
			System.out.println("Não é divisivel por nenhum deles!");
		}
		
		sc.close();
	}

}
