package esercizio20301;

import java.util.Scanner;

public class Auto {
	
	
	private int km;
	private int litri;
	
	public Auto(int km, int litri) {
		this.km = km;
		this.litri = litri;
	}
	
	public Auto() {
		
	}
	
	public void calcolaConsumo() {
		Scanner console = new Scanner(System.in);
		System.out.println("Inserire i km percorsi");
		int km = console.nextInt();
		try {
			System.out.println("Inserire i litri");
			int litri = console.nextInt();
			int consumo = km/litri;
			System.out.println(consumo);
		} catch(ArithmeticException ae) {
			System.out.println("Valore non consentito. Devi inserire un valore diverso da 0");
		}
		
		
	}
}
