package eserciziTre0203;

import java.time.LocalDate;

public class Motozappa extends Apparecchiatura{
	private int ruote;
	private int frese;
	
	public Motozappa(int numeroOrdine, String marca, LocalDate dataIngresso, int ruote, int frese) {
		super(numeroOrdine, marca, dataIngresso);
		this.ruote = ruote;
		this.frese = frese;
	}

	public int getRuote() {
		return ruote;
	}

	public void setRuote(int ruote) {
		this.ruote = ruote;
	}

	public int getFrese() {
		return frese;
	}

	public void setFrese(int frese) {
		this.frese = frese;
	}
	
	
}
