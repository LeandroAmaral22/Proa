package javabasico;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Infome um n�mero: ");
		double n1 = sc.nextInt();
		
		System.out.print("Infome um n�mero: ");
		double n2 = sc.nextInt();
		
		double soma = n1 + n2;
		double mult = n1 * n2;
		double div = n1 / n2;
		double sub = n1 - n2;
		
		System.out.println();
		System.out.printf("Soma: %.2f \n", soma);
		System.out.printf("Subtra��o: %.2f \n", sub);
		System.out.printf("Multiplica��o: %.2f \n", mult);
		System.out.printf("Divis�o: %.2f \n", div);
		
		sc.close();
		
	}

}
