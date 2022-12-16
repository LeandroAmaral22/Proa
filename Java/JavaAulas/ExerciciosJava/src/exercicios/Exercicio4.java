package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor A: ");
		double a = sc.nextDouble();
		
		System.out.print("Informe um valor B: ");
		double b = sc.nextDouble();
		
		System.out.print("Informe um valor C: ");
		double c = sc.nextDouble();
		
		if(b > a && b > c) {
			if(c > a) {
				System.out.println(b + " " + c + " " + a);
			}else {
				System.out.println(b + " " + a + " " + c);
			}
		}else if(c > a && c > b) {
			if(a > b) {
				System.out.println(c + " " + a + " " + b);
			}else {
				System.out.println(c + " " + b + " " + a);
			}
		}else {
			System.out.println(a + " " + b + " " + c);
		}
	}

}
