package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSwitchCase {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Selecione uma opção: (1)-BigMac (2)-Quarterão (3)-McChicken (4)-McTasty (5)-McMelt");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Big Mac: 1 BigMac + Batata Frita Pequena + Refrigerante \nR$24,90");
			break;
		case 2:
			System.out.println("Quarterão: 1 Quarterão + Batata Frita Grande + Refrigerante + Sundae \nR$27,90");
			break;
		case 3:
			System.out.println("McChicken: 1 McChicken + Batata Frita pequena + Refrigerante + Nuggets \nR$31,90");
			break;
		case 4:
			System.out.println("McTasty: 1 McTasty + Batata Frita Média + Refrigerante \nR$28,90");
			break;
		case 5:
			System.out.println("McMelt: 1 MecMelt + Batata Frita Grande + Refrigerante + 2 Tortas \nR$30,90");
			break;
		default:
			System.out.println("Opção Inválida!");
		}

	}

}
