package lab1;

public class Aluno extends Cliente{

	private int matricula;
	
	public Aluno(String nome, int matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}	
}
