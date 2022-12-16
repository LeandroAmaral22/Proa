package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[3];
        int[] idades = new int[3];
        int idadeMaisNova = 99;
        String nomeDaPessoaMaisNova = "";
    
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = sc.next();
            System.out.print("Digite a idade: ");
            idades[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            if (idades[i] < idadeMaisNova) {
                idadeMaisNova = idades[i];
                nomeDaPessoaMaisNova = nomes[i];
            }
        }
    
        System.out.println("\nNome da pessoa mais nova: " + nomeDaPessoaMaisNova);
        System.out.println("Idade da pessoa mais nova: " + idadeMaisNova);
        
        sc.close();

	}

}
