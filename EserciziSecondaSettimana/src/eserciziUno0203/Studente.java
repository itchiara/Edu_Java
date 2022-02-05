package eserciziUno0203;

public class Studente extends Persona{
	
	private int matricolaStudente;
	private String corsoDiLaurea;
	private StatoStudente statoStud;
	
	public Studente(String nome, String cognome, int matricolaStudente, String  corsoDiLaurea, StatoStudente statoStud) {
		super(nome, cognome);
		this.matricolaStudente = matricolaStudente;
		this.corsoDiLaurea = corsoDiLaurea;
		this.statoStud = statoStud;
	}
	
	public String infoStudente() {
		String partePersona = info();
		String risultato = partePersona + " " + matricolaStudente + " " + corsoDiLaurea + " " + statoStud;
		return risultato;
	}

	public int getMatricolaStudente() {
		return matricolaStudente;
	}

	public void setMatricolaStudente(int matricolaStudente) {
		this.matricolaStudente = matricolaStudente;
	}

	public String getCorsoDiLaurea() {
		return corsoDiLaurea;
	}

	public void setCorsoDiLaurea(String corsoDiLaurea) {
		this.corsoDiLaurea = corsoDiLaurea;
	}

	public StatoStudente getStatoStud() {
		return statoStud;
	}

	public void setStatoStud(StatoStudente statoStud) {
		this.statoStud = statoStud;
	}
	
	

}
