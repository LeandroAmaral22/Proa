package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExemploIf3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Informe seu peso: ");
		double peso = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("\nSeu IMC é: %.1f", imc);
		
		System.out.println();
		if(imc <= 18.5) {
			System.out.println("Abaixo do peso!");
		}else if(imc >= 18.6 && imc <= 24.9) {
			System.out.println("Peso ideial (parabéns)");
		}else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Levemente acima do peso");
		}else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade grau I");
		}else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade grau II (severa)");
		}else {
			System.out.println("Obesidade III (móbida)");
		}
		
		sc.close();
	}

}
