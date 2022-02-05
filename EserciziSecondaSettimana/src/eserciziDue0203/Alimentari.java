package eserciziDue0203;

import java.time.LocalDate;

public class Alimentari extends Prodotto{
	private LocalDate dataScadenza;
	private boolean vegano;
	
	public Alimentari(int codice, String descrizione, double prezzo, LocalDate dataScadenza, boolean vegano) {
		super(codice, descrizione, prezzo);
		this.dataScadenza = dataScadenza;
		this.vegano = vegano;
	}
	public Alimentari() {}
	
	public LocalDate getDataScadenza() {
		return dataScadenza;
	}
	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	public boolean isVegano() {
		return vegano;
	}
	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}
	
	
}
