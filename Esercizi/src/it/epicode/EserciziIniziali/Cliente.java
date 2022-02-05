package it.epicode.EserciziIniziali;

import java.time.LocalDate;

public class Cliente {
	
	public String nome;
	public String cognome;
	public String codiceFiscale;
	public String numeroDiTelefono;
	public LocalDate dataNascita;
	public ContoCorrente conti[] = new ContoCorrente[3];
	
	public void saluta() {
		System.out.println("Buongiorno, sono " + nome + " " + cognome);
	}
	
	public boolean aggiungiConto(ContoCorrente c) { //inserisce un nuovo conto se all'interno dell'oggetto ContoCoorente è presente un conto disponibile su 3 totali
		for(int i = 0; i < conti.length; i++) {
			if(conti[i] == null) {
				conti[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public ContoCorrente rimuoviConto(int pos) { //rimuovere un conto 
		ContoCorrente rimosso = conti[pos];
		conti[pos] = null;
		return rimosso;
	}
	
	public boolean isMilleanial() { 
//		if(dataNascita.getYear()>=2000) {
//			return true;
//		}
//		return false;
		return dataNascita.getYear()>=2000;
	}
	
	public double getSaldoTotale() {
		double saldoTotale=0;
		for(int i = 0; i < conti.length; i++) {
			if (conti[i] != null) {
				saldoTotale = saldoTotale + conti[i].saldo;
			}
		}
		return saldoTotale;
	}
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cognome, String codiceFiscale, String numeroDiTelefono, LocalDate dataNascita, ContoCorrente c) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.numeroDiTelefono = numeroDiTelefono;
		this.dataNascita = dataNascita;
		this.conti[0] = c;
	}
	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
}
