package lab1;

public class Servidor extends Cliente{
	private int siape;
	
	public Servidor(String nome, int siape) {
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
