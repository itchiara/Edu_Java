package esercizio30301;

public class BancaException extends Exception{
	private String message;
	
	public BancaException(String message) {
		super(message);
	}
	
	public String toString() {
		return message;
	}
}
