package it.epicode.Scuola;

public class Docente {
	public String nome;
	public String cognome;
	public boolean liberoProfessionista;
	
	public Docente() {
		
	}
	
	public Docente(String nome, String cognome, boolean liberoProfessionista) {
		this.nome = nome;
		this.cognome = cognome;
		this.liberoProfessionista = liberoProfessionista;
	}
}
