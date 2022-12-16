package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em °C: ");
		double celsius = sc.nextInt();
		
		double fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
		
		sc.close();

	}

}
