package aepArthur;

public class Aluno {

	public Aluno(String nome) {
		if(nome == null || nome.length()==0) {
			new RuntimeException("Deve ser informado qual o nome do aluno.");
		}
	}
}
