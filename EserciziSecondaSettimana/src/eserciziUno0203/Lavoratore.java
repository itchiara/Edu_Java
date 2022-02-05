package eserciziUno0203;

import java.time.LocalDate;

public class Lavoratore extends Persona{
	
	private String matricolaLavoratore;
	private String azienda;
	private LocalDate dataAssunzione;
	private StatoLavoratore statoLav;
	
	public Lavoratore(String nome, String cognome, String matricolaLavoratore, String azienda, LocalDate dataAssunzione, StatoLavoratore statoLav) {
		super(nome, cognome);
		this.matricolaLavoratore = matricolaLavoratore;
		this.azienda = azienda;
		this.dataAssunzione = dataAssunzione;
		this.statoLav = statoLav;
	}
	
	public String infoLavoratore() {
		String partePersona = info();
		String ris = partePersona + " " + matricolaLavoratore + " " + azienda + " " + dataAssunzione + " " + statoLav;
		return ris;
	}

	public String getMatricolaLavoratore() {
		return matricolaLavoratore;
	}

	public void setMatricolaLavoratore(String matricolaLavoratore) {
		this.matricolaLavoratore = matricolaLavoratore;
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	public LocalDate getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(LocalDate dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public StatoLavoratore getStatoLav() {
		return statoLav;
	}

	public void setStatoLav(StatoLavoratore statoLav) {
		this.statoLav = statoLav;
	}
	
	
}
