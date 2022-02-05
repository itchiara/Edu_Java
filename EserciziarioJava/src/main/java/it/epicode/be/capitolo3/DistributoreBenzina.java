package it.epicode.be.capitolo3;

public class DistributoreBenzina {

	private double depositoBenzina;
	private double depositoGasolio;
	private double euroPerLitroBenzina;
	private double euroPerLitroGasolio;
	
	public DistributoreBenzina(double unPrezzoPerLitroB, double prezzoG) {
		this.depositoBenzina = 0;
		this.depositoGasolio = 0;
		this.euroPerLitroBenzina = unPrezzoPerLitroB;
		this.euroPerLitroGasolio = prezzoG;
	}
	
	public void rifornisciGasolio(double unaQuantita) {
		depositoGasolio += unaQuantita;
	}
	
	public void rifornisciBenzina(double unaQuantita) {
		depositoBenzina += unaQuantita;
	}
	
	public void vendi(double euro, Automobile unaAutomobile) {
		String tipoCarbVendita = unaAutomobile.getTipoDiCarburante();
		if(unaAutomobile.usaBenzina()) {
			double litriVenduti =euro/euroPerLitroBenzina;
			if(litriVenduti<=depositoBenzina) {
				unaAutomobile.addGas(litriVenduti);
				depositoBenzina -= litriVenduti;
			} System.out.println("Il distributore non ha abbastanza litri");
			 
		} else if(tipoCarbVendita.equals(TipoCarburante.GASOLIO)) {
			double litriVenduti =euro/euroPerLitroGasolio;
			if(litriVenduti<=depositoGasolio) {
				unaAutomobile.addGas(litriVenduti);
				depositoGasolio -= litriVenduti;
			} System.out.println("Il distributore non ha abbastanza litri");			 
		}
		
	}
	
	public void aggiornaBenzina(double unPrezzoPerLitro) {
		euroPerLitroBenzina = unPrezzoPerLitro;
	}
	
	public void aggiornaGasolio(double unPrezzoPerLitro) {
		euroPerLitroGasolio = unPrezzoPerLitro;
	}
	
	public double getDepositoBenzina() {
		return depositoBenzina;
	}
	
	public double getDepositoGasolio() {
		return depositoGasolio;
	}
}
