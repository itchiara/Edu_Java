package it.epicode.be;

public class Madre {

	static final String nome = "madre";
	static String email = "abc@google.it";
	public String indirizzo = "via orietta berti";
	int eta = 50;
	private boolean haFigli = true;
	
	public static void mangia() {
		System.out.println("la mamma mangia");
	}
	
	public static void stira() {
		System.out.println("la mamma stira");
	}
	
	public void beve() {
		System.out.println("la mamma beve");
	}
	
	public void respira() {
		System.out.println("la mamma respira");
	}
}
