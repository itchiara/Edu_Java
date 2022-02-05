package it.epicode.be.capitolo3;

public class Automobile {

	private double litriCarburante;
	private double chilometriTotaliPercorsi;
	private double resa = chilometriTotaliPercorsi/litriCarburante;
	private TipoCarburante tipoCarburante;
	
	public Automobile(double resa) {
		this.litriCarburante = 0;
		this.resa = resa;
	}
	
	public void drive(double distanza) {
		System.out.println("guida");
		litriCarburante -= distanza/resa;
		System.out.println("litri rimasti "+litriCarburante);
		chilometriTotaliPercorsi += distanza;
		System.out.println("km accumulati "+chilometriTotaliPercorsi);
	}
	
	public double getGas() {
		return litriCarburante;
	}
	
	public double addGas(double rifornimento) {
		return litriCarburante += rifornimento;
	}

	
	public boolean usaBenzina() {
		if(tipoCarburante==TipoCarburante.BENZINA) {
			return true;
		} return false;
	}
	
	public boolean usaGasolio() {
		if(tipoCarburante==TipoCarburante.GASOLIO) {
			return true;
		} return false;
	}
	
	
	public String getTipoDiCarburante() {
		if(TipoCarburante.BENZINA.equals(tipoCarburante)) {
			return "benzina";
		} else {
			return "gasolio";
		}
	}


	public void setTipoCarburante(TipoCarburante tipoCarburante) {
		this.tipoCarburante = tipoCarburante;
	}
	
}
