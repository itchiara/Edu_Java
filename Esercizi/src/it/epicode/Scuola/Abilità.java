package it.epicode.Scuola;

public class Abilit� {
	public String nome;
	public String area;
	public Livello livello;
	
	public Abilit�(String nome, String area, Livello livello) {
		this.nome = nome;
		this.area = area;
		this.livello = livello; //Livello.avanzato, Livello.principiate...
	}
}
