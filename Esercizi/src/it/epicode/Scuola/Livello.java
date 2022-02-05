package it.epicode.Scuola;

public enum Livello {
	PRINCIPIANTE(0), INTERMEDIO(1), AVANZATO(2), GURU(3);
	//PRINCIPIANTE, INTERMEDIO, AVANZATO, GURU;
	public int number;
	Livello(int n) {
		number = n; 
	}
	
	public boolean isExpert() {
		return this == Livello.AVANZATO || this == Livello.GURU;
	}
	//quando ho una serie di alternative le rappresento con enum
}
