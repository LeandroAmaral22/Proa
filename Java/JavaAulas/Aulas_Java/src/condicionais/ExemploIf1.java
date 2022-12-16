package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExemploIf1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double notas = 0;
		double soma = 0;
		
		for(int i=1; i<=2; i++) {
			System.out.print("Informe a " + i + "° nota: ");
			notas = sc.nextDouble();
			soma += notas;
		}
		
		double media = soma / 2;
		
		System.out.println();
		System.out.printf("Média: %.2f", media);
		
		System.out.println();
		if(media >= 6) {
			System.out.println("Aprovado!");
		}else if(media >= 5){
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado!");
		}
		
		sc.close();
	}

}
