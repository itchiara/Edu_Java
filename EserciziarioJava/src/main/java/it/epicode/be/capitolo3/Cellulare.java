package it.epicode.be.capitolo3;

public class Cellulare {

	private double credito;
	private int numeroChiamate;
	
	public Cellulare(double unaCarica) {
		this.credito = unaCarica;
	}
	
	public void ricarica(double unaRicarica) {
		credito += unaRicarica;
	}
	
	public void chiama(double minutiChiamata) {
		if(credito>0) {
			numeroChiamate++;
			credito -= 0.2 * minutiChiamata;
		} else {
			System.out.println("Non è possibile chiamare. Credito insufficiente");
		}
		
	}
	

	public double numero404() {
		System.out.println("La carica attuale è "+credito);
		return credito;
	}
	
	public int getNumeroChiamate() {
		System.out.println(numeroChiamate);
		return numeroChiamate;
	}
	
	public void azzeraChiamate() {
		numeroChiamate = 0;
	}
}
