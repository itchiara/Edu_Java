package esercizioCompiti10302;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Start {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Inserisci il numero di parole che vuoi aggiungere");
		int inputNumero = console.nextInt();
		console.nextLine();
		Set<String> parole = new HashSet<String>();
		Set<String> altreParole = new HashSet<String>();
		for (int i = 0; i < inputNumero; i++) {
			System.out.println("Inserisci la parola");
			//console.nextLine();
			String p = console.nextLine();
			//console.nextLine();
			//parole.add(p);
			if(parole.add(p)) {
				System.out.println("Hai aggiunto la parola");
				parole.add(p);
			} else {
				//Set<String> altreParole = new HashSet<String>();
				System.out.println("Parola duplicata");
				altreParole.add(p);
				//System.out.println(altreParole);
			}
		}
		System.out.println(parole.size());
		System.out.println("Le parole distinte sono" + parole);
		System.out.println("Le parole duplicate sono" + altreParole);

	}

}
