package eserciziTre0203;

import java.time.LocalDate;

public class Apparecchiatura {
	private int numeroOrdine;
	private String marca;
	private LocalDate dataIngresso;
	private Lavorazione[] lavorazioni = new Lavorazione[10];
	
	public Apparecchiatura(int numeroOrdine, String marca, LocalDate dataIngresso) {
		this.numeroOrdine = numeroOrdine;
		this.marca = marca;
		this.dataIngresso = dataIngresso;
	}

	
	public Apparecchiatura() {}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	public boolean inserisciLavorazione(Lavorazione nuovaLav) {
		for (int i = 0; i < 10; i++) {
			if(lavorazioni[i] == null) {
				lavorazioni[i] = nuovaLav;
				return true;
			}
		}return false;
	}
	public double costoTotale() {
		double costo = 0;
		for (int i = 0; i < lavorazioni.length; i++) {
			if(lavorazioni[i] != null) {
				costo += lavorazioni[i].getCosto();
			}
		}
		return costo;
	}
	
	public void elencoLavorazioni(Lavorazione[] lavorazioniEseguite) {
		for (int i = 0; i < lavorazioniEseguite.length; i++) {
			System.out.println(lavorazioniEseguite[i].getTipo());
		}
	}
	
	
}
