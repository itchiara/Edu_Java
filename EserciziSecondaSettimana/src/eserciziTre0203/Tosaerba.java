package eserciziTre0203;

import java.time.LocalDate;

public class Tosaerba extends Apparecchiatura{
	private int ruote;

	public Tosaerba(int numeroOrdine, String marca, LocalDate dataIngresso, int ruote) {
		super(numeroOrdine, marca, dataIngresso);
		this.ruote = ruote;
	}

	public int getRuote() {
		return ruote;
	}

	public void setRuote(int ruote) {
		this.ruote = ruote;
	}
	
	
	
}
