package it.epicode.Scuola;
import java.time.LocalDate;
public class Studente {
	public String nome;
	public String cognome;
	public LocalDate dataDiNascita;
	public String codiceFiscale;
	public final int NUMERO_ABILITA = 2;
	public Abilit� abilit�[] = new Abilit�[NUMERO_ABILITA];
	
//	public Studente(String nome, String cognome, LocalDate dataDiNascita, String codiceFiscale, Abilit� abilit�1, Abilit� abilit�2) {
//		this.nome = nome;
//		this.cognome = cognome;
//		this.dataDiNascita = dataDiNascita;
//		this.codiceFiscale = codiceFiscale;
//		this.abilit�[0] = abilit�1;
//		this.abilit�[1] = abilit�2;
//	}

	public Studente(String nome, String cognome, LocalDate dataDiNascita, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.codiceFiscale = codiceFiscale;
	}
	
}
