package it.epicode.be.capitolo2;

public class Rettangolo {

	private double altezza;
	private double base;
	private double ascissa;
	private double ordinata;
	
	public Rettangolo(double altezza, double lunghezza, double coordinataX, double coordinataY) {
		this.altezza = altezza;
		this.base = lunghezza;
		this.ascissa = coordinataX;
		this.ordinata = coordinataY;
	}
	
	public Rettangolo() {
		this.altezza = 3;
		this.base = 4.1;
		this.ascissa = 5.6;
		this.ordinata = 9.3;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public void trasla(double x, double y) {
		ascissa += x;
		ordinata += y;
	}
	
	public double calcolaPerimetro() {
		double perimetro = (altezza + base) *2;
		return perimetro;
	}
	
	public double calcolaArea() {
		double area = altezza * base;
		return area;
	}

	@Override
	public String toString() {
		return "Rettangolo [altezza=" + altezza + ", lunghezza=" + base + ", coordinataX=" + ascissa
				+ ", coordinataY=" + ordinata + "]";
	}


	
	
}
