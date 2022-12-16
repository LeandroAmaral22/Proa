package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i=1; i<=15; i++) {
			soma += i;
		}
		
		System.out.println("Soma dos números: " + soma);
		
		sc.close();
	}

}
