package it.epicode.be;

public class Figlia extends Madre{

	static String email = "cde@bo.it";
	public String indirizzo = "via felicita";
	boolean minorenne = true;
	
	public static void gioca() {
		System.out.println("la figlia gioca");
	}
	
	public void respira() {
		System.out.println("la figlia respira");
	}
	
	public static void mangia() {
		System.out.println("la figlia mangia");
	}
	
	public void cazzeggia() {
		System.out.println("la figlia cazzeggia");
	}
}
