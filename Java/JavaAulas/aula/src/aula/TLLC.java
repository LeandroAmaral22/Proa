package aula;

public class TLLC {
	public static void main(String[] args) {
		String diaDaSemana = "domingo";
		switch (diaDaSemana) {
		case "s�bado":
		case "domingo":
			System.out.println("� fim de semana");
		case "segunda-feira":
		case "ter�a-feira":
		case "quarta-feira":
		case "quinta-feira":
		case "sexta-feira":
			System.out.println("� dia �til");
		}
	}
}
