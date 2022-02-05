package esempiLambda;

public class Libro {
	private int prezzo;
	private String nome;
	public Libro(int prezzo, String nome) {
		this.prezzo = prezzo;
		this.nome = nome;
	}

	public int getPrezzo() {
		return prezzo;
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
}
