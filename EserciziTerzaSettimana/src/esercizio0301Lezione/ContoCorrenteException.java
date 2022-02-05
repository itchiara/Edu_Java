package esercizio0301Lezione;

public class ContoCorrenteException extends Exception{
	private double sforo;
	
	public ContoCorrenteException(String message, double sforo) {
		super(message);
		this.sforo = sforo;

	}
	
	public double getSforo() {
		return sforo;
	}
}
