package esercizio0302;

public class Persona {
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	public Persona(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getCodiceFIscale() {
		return codiceFiscale;
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("chiamato equals");
		if(o != null && o.getClass() != Persona.class) {
			return false;
		}
		Persona other = (Persona) o;
		return codiceFiscale.equals(other.codiceFiscale);
//		if(codiceFiscale.equals(other.codiceFiscale)) {
//			return true;
//		}
//		return false;
	}
	
	//gli hashCode sono ereditati da Object, quando modifico equals devo modificare hashcode se no non funziona
	@Override
	public int hashCode() {
		System.out.println("chiamato hashCode");
		return codiceFiscale.hashCode();
		//return -1;
	}
	
	@Override
	public String toString() {
		return nome + " " + cognome;
	}
}
