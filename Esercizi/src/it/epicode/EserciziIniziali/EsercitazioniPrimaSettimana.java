package it.epicode.EserciziIniziali;
import java.util.Scanner;
public class EsercitazioniPrimaSettimana {
	
	public static void main(String[] args) {
		
	
		int x[] = {1, 32, 34, 4, 765, 87, 9};
		boolean found = findInArray(x, 3);
		if (found) {
			System.out.println("Target trovato");
		} else {
			System.out.println("Target non trovato");
		}
		String nome1 = "riccardo";
		String nome2 = "pippo";
		String messaggio = saluta(nome1, nome2);
		System.out.println(messaggio);
		
		Scanner console = new Scanner(System.in);
		System.out.println("Scrivi una frase");
		String firstSentence = console.nextLine(); //dentro firstSentence indirizzo della stringa che è stata creata a partire da quello che l'utente digita
		System.out.println("Scrivi una frase");
		String secondSentence = console.nextLine();
		System.out.println("Scrivi una frase");
		String thirdSentence = console.nextLine();
		System.out.println(thirdSentence + " "+ secondSentence + " " + firstSentence);
		
		//Seconda versione
		String[] frasi = new String[3];
		for(int i = 0; i < frasi.length;  i++) {
			System.out.println("Dammi una frase");
			frasi[i] = console.nextLine();
		}
		for(int i = frasi.length - 1; i >= 0; i--) {
			System.out.print(frasi[i]);
			if(i != 0) {
				System.out.print(" ");
			}
		}
		console.close();
	}

	
	public static boolean findInArray(int[] array, int target) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return true;
			}
		}
		return false;
	} 
	
	public static String saluta(String firstName, String secondName) {
		String saluto = "Buongiorno " + firstName + ", buongiorno " + secondName;
		return saluto;
	}
	
	
	
	public static String[] inserisci(String[] original, String aggiunta) {
		String[] nuoveStringhe = new String[original.length + 1];
		nuoveStringhe[0] = original[0];
		nuoveStringhe[1] = original[1];
		nuoveStringhe[2] = aggiunta;
		nuoveStringhe[3] = original[2];
		
		int i = 0;
		while(i < original.length) {
			nuoveStringhe[i] = original[i];
		}
		nuoveStringhe[2] = aggiunta;
		return nuoveStringhe;
	}
	
}
