package aepArthur;

public class Avaliação {

	public Avaliação(String avaliação) {
		if(avaliação == null || avaliação.length()==0) {
			new RuntimeException("Deve ser informado qual a avaliação.");
		}
	}
}
