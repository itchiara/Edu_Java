package it.epicode.be.capitolo4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//esercizio1
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.pow(10, i));
		}
		
		//esercizio2
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una data in giorni, ore e minuti");
		System.out.println("Inserisci i giorni");
		double giorni = scanner.nextDouble();
		System.out.println("Inserisci le ore");
		double ore = scanner.nextDouble();
		System.out.println("Inserisci i minuti");
		double minuti = scanner.nextDouble();
		System.out.println("Inserisci i secondi");
		double secondi = scanner.nextDouble();
		TimeConverter convertitore = new TimeConverter(giorni, ore, minuti, secondi);
		System.out.println("Il tempo calcolato in secondi è: " + convertitore.calcolaSecondi());
		
		//esercizio3
		Scanner console = new Scanner(System.in);
		System.out.println("converti i secondi in giorni, ore, minuti e secondi");
		System.out.println("Inserisci i secondi");
		double daSecondi = console.nextDouble();
		SecondConverter convertitoreDaSecondi = new SecondConverter(daSecondi);
		convertitoreDaSecondi.calcola();
		
		long x = 426189%86400;
		int b = 41%7;
		long y = x/3600;
		System.out.println(b);
		System.out.println(y);
		long sTot = 42184659l;
		long dLocal = sTot / 86400;
		System.out.println(dLocal);
		long sLocal = sTot % 86400;
		System.out.println(sLocal);
		long hLocal = sLocal / 3600;
		System.out.println(hLocal);
		
	}

}
