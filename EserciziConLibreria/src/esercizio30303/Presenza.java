package esercizio30303;

public class Presenza {
	private String nome;
	private int presenze;
	
	public Presenza(String nome, int presenze) {
		this.nome = nome;
		this.presenze = presenze;
	}

	public String getNome() {
		return nome;
	}

	public int getPresenze() {
		return presenze;
	}
	
	@Override
	public String toString() {
		return nome + "#" + presenze + "@";
	}
	

	
	
}
