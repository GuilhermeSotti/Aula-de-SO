package controle;

public class Opera��escontrole {

	public Opera��escontrole() {
		super();
	}
	
	public void opera��oString() {
		
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
	
	public void opera��oBuffer() {
		
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
	
	public void opera��oFrase(String frase) {
		
		String[] palavras = frase.split(" ");
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
