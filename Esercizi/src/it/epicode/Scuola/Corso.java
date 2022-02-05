package it.epicode.Scuola;

public class Corso {
	public String nome;
	public int durata;
	public Livello livello;
	public double prezzo;
	
	public Corso() {
		
	}
	
	public Corso(String nome, int durata, Livello livello, double prezzo) {
		this.nome = nome;
		this.durata = durata;
		this.livello = livello;
		this.prezzo = prezzo;
	}
	
}
