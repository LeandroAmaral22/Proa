package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o n�mero do dia da semana: ");
		int diaSemana = sc.nextInt();
		
		String nomeDia;

		switch (diaSemana) {
		case 1:
			nomeDia = "Domingo";
			break;
		case 2:
			nomeDia = "Segunda";
			break;
		case 3:
			nomeDia = "Ter�a";
			break;
		case 4:
			nomeDia = "Quarta";
			break;
		case 5:
			nomeDia = "Quinta";
			break;
		case 6:
			nomeDia = "Sexta";
			break;
		case 7:
			nomeDia = "S�bado";
			break;

		default:
			nomeDia = "Dia inv�lido";

		}

		System.out.println("O dia da semana �: " + nomeDia);

	}

}
