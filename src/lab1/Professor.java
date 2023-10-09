package lab1;

public class Professor extends Cliente {
	private int siape;
	
	public Professor(String nome, int siape) {
		super(nome);
		this.siape = siape;
	}

	public String getNome() {
		return nome;
	}

	public int getSiape() {
		return siape;
	}	
}
