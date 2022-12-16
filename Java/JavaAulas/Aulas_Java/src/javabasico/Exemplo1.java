package javabasico;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.print("Infome um número: ");
		x = sc.nextDouble();
		
		System.out.printf("%.2f", x);
		System.out.println();
		
		sc.nextLine();
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("O nome informado foi: " + nome);
		
		sc.close();
	}

}
