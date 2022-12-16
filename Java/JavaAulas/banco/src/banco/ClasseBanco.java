package banco;

import java.util.Scanner;

public class ClasseBanco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente conta1 = new ContaCorrente("Leandro", 2500);	
		
		conta1.Iniciar();

	}

}
