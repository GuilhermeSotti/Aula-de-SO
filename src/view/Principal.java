package view;

import controle.Opera��escontrole;

public class Principal {

	public static void main(String[] args) {
		
		Opera��escontrole opController = new Opera��escontrole();
//		opController.opera��oString();
//		opController.opera��oBuffer();
		
		String frase = "Bem vindos de volta a FATEC Zona Leste";
		opController.opera��oFrase(frase);
	}
}
