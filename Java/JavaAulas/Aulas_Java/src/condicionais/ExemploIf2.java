package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExemploIf2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();
		
		if(idade < 16) {
			System.out.println("Não pode votar!");
		}else if(idade >= 18 && idade <= 79) {
			System.out.println("Voto obrigatório!");
		}else {
			System.out.println("Voto opicional!");
		}
		
		sc.close();
	}

}
