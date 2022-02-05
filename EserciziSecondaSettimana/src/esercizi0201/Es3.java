package esercizi0201;

import java.util.Scanner;

public class Es3 {

	public static void main(String[] args) {
//		String stringa = null;
//		do {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Inserire una stringa seguita dal tasto Invio");
//		stringa = scanner.nextLine();
//		
//		// Splitta la riga in un array di caratteri
//		String[] arrayStringa = stringa.split("");
//		
//		String stringaSpezzata = null;
//		
//		for (int i=0;i<arrayStringa.length;i++) {
//			if (stringaSpezzata == null) {
//				stringaSpezzata = arrayStringa[i];
//			} else {
//				stringaSpezzata = stringaSpezzata + "," + arrayStringa[i];				
//			}
//		}
//		
//		System.out.println("String spezzata: " + stringaSpezzata);
//		// Ripete fino a che la stringa è diversa da :q
//		} while (!":q".equals(stringa));
		
		/*ALTRA VERSIONE
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String parola = scanner.nextLine();
		
		while (!parola.equals(":q")) {
			for(int i = 0; i < parola.length(); i++) {
				System.out.print(parola.charAt(i) + ",");
				}
				System.out.println("Inserisci una parola");
				String parola = scanner.nextLine();
				}
		
		
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci qualsiasi carattere per entrare nel programma");
		String check = scanner.nextLine();
		String close = ":q";
		while (!check.equals(close)) {
			System.out.println("Inserisci una stringa");
			String string = scanner.nextLine();
			stringDivider(string);
			System.out.println(" Per uscire inserisci :q");
			check = scanner.nextLine();
		}
		scanner.close();
	}
	
	public static void stringDivider(String string) {
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i) + ",");
		}
	}
	
	

}
