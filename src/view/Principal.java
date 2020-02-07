package view;

import controle.Operaçõescontrole;

public class Principal {

	public static void main(String[] args) {
		
		Operaçõescontrole opController = new Operaçõescontrole();
//		opController.operaçãoString();
//		opController.operaçãoBuffer();
		
		String frase = "Bem vindos de volta a FATEC Zona Leste";
		opController.operaçãoFrase(frase);
	}
}
