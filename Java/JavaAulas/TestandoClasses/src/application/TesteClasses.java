package application;

import entities.Caneta;

public class TesteClasses {

	public static void main(String[] args) {
		
		
		Caneta caneta1 = new Caneta();
		
		caneta1.setCor("Preta");
		caneta1.setModelo("Esferografica");
		caneta1.setCarga(10);
		caneta1.setPonta(0.5f);
		caneta1.tampar();
		
		caneta1.estado();
		caneta1.rabiscar();
		
	}

}
