package aepArthur;

public class Nota {

	public Nota(double nota) {
		if (nota<0 || nota>10) {
			new RuntimeException("Nota deve ser entre 0 e 10!");
		}
	}
}
