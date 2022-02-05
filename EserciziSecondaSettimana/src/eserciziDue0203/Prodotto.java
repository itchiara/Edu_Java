package eserciziDue0203;

public class Prodotto {
	private int codice;
	private String descrizione;
	private double prezzo;
	
	public int getCodice() {
		return codice;
	}
	
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public void applicaSconto() {
		prezzo = prezzo - (prezzo *5/100);
	}
	
	public String datiProdotto() {
		return codice + " " + descrizione + " " + prezzo;
	}
	
	public Prodotto() {}
	
	public Prodotto(int codice, String descrizione, double prezzo) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
}
