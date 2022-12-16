package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		double saldo = sc.nextDouble();
		
		saldo *= 1.5;
		
		System.out.printf("Saldo com reajuste: %.2f", saldo);
		
		sc.close();

	}

}
