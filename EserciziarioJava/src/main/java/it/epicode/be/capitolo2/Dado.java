package it.epicode.be.capitolo2;

public class Dado {

	private int numeroFacce;
	
	public long lanciaDado() {
		long valore = 0;
		valore = Math.round(Math.random()*numeroFacce);
		return valore;
	}
	
	public Dado(int numFac) {
		this.numeroFacce = numFac;
	}
}
