package it.epicode.Scuola;

public class Abilità {
	public String nome;
	public String area;
	public Livello livello;
	
	public Abilità(String nome, String area, Livello livello) {
		this.nome = nome;
		this.area = area;
		this.livello = livello; //Livello.avanzato, Livello.principiate...
	}
}
