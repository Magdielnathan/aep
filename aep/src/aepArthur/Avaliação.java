package aepArthur;

public class Avalia��o {

	public Avalia��o(String avalia��o) {
		if(avalia��o == null || avalia��o.length()==0) {
			new RuntimeException("Deve ser informado qual a avalia��o.");
		}
	}
}
