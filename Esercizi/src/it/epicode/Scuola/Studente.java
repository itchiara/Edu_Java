package it.epicode.Scuola;
import java.time.LocalDate;
public class Studente {
	public String nome;
	public String cognome;
	public LocalDate dataDiNascita;
	public String codiceFiscale;
	public final int NUMERO_ABILITA = 2;
	public Abilità abilità[] = new Abilità[NUMERO_ABILITA];
	
//	public Studente(String nome, String cognome, LocalDate dataDiNascita, String codiceFiscale, Abilità abilità1, Abilità abilità2) {
//		this.nome = nome;
//		this.cognome = cognome;
//		this.dataDiNascita = dataDiNascita;
//		this.codiceFiscale = codiceFiscale;
//		this.abilità[0] = abilità1;
//		this.abilità[1] = abilità2;
//	}

	public Studente(String nome, String cognome, LocalDate dataDiNascita, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.codiceFiscale = codiceFiscale;
	}
	
}
