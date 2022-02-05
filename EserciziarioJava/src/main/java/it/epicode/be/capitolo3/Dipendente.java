package it.epicode.be.capitolo3;

public class Dipendente {

	private String nome;
	private double stipendio;
	
	public Dipendente() {}
	
	public Dipendente(String nome, double stipendio) {
		this.nome = nome;
		this.stipendio = stipendio;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public double aumento(double percentuale) {
		double aumento = stipendio * percentuale /100;
		return stipendio += aumento;
	}
}
