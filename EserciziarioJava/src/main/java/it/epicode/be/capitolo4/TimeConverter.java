package it.epicode.be.capitolo4;

public class TimeConverter {

	private static final int GIORNI_SECONDI = 86400;
	private static final int ORE_SECONDI = 3600;
	private static final int MINUTI_SECONDI = 60;
	private double giorni;
	private double ore;
	private double minuti;
	private double secondi;
	
	public TimeConverter(double giorni, double ore, double minuti, double secondi) {
		this.giorni = giorni;
		this.ore = ore;
		this.minuti = minuti;
		this.secondi = secondi;
	}
	
	public double calcolaSecondi() {
		return giorni * GIORNI_SECONDI + ore * ORE_SECONDI + minuti * MINUTI_SECONDI + secondi;
	}
	
}
