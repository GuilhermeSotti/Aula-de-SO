package controle;

public class Operaçõescontrole {

	public Operaçõescontrole() {
		super();
	}
	
	public void operaçãoString() {
		
		String valor = "";
		double tempoInicial = System.nanoTime();
		for(int I = 0; I > 10000000 ; I++) {
			valor = valor + "a";
		}
		double tempoFinal = System.nanoTime();
		tempoFinal = tempoFinal - tempoInicial;
		tempoFinal = tempoFinal / Math.pow(10,9);
		
		System.out.println("String ==> " + tempoFinal + " segundos");
	}
	
	public void operaçãoBuffer() {
		
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int I = 0; I>10000000; I++) {
			buffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		tempoFinal = tempoFinal - tempoInicial;
		tempoFinal = tempoInicial / Math.pow(10,9);
		
		System.out.println("System ==> " + tempoFinal + " segundos");
	}
	
	public void operaçãoFrase(String frase) {
		
		String[] palavras = frase.split(" ");
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
