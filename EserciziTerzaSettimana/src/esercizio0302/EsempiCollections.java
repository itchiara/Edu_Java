package esercizio0302;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EsempiCollections {
	public static void main(String[] args) {
		List<String> parole = new  LinkedList<String>();
		//parole.add(22);
		List parole2 = new  LinkedList();
		parole2.add(43);
		parole.add("ciccio");
		parole2.add("pippo");
		parole2.add(new Integer (4));
		String s = parole.get(0);
		if(parole2.get(0) instanceof String) { //collection polimorfiche di object erano troppo generali
			String s2 = (String) parole2.get(0);
		}
		//String s2 = (String) parole2.get(0); //c'è una stringa effettivamente, quindi l'indirizzo sarà quello di una stringa, ma il compilatore non lo fa
		f(parole);
		f(parole2); //sono lo stesso tipo, non esiste la lista di stringhe specifica o altro
		//g(parole);
		//g(parole2);
		
		Pair<String, String> stringPair = new Pair<>("pippo", "pluto");
		Pair<String, Integer> mixedPair = new Pair<>("pluto", 100);
		Integer it = mixedPair.getSecond();
		Pair p = new Pair("hey", 20); //uguale a linea 10, è una classe Pair che lavora con object
		p.getSecond();
		BadPair bp = new BadPair("wooo", 50);
		
		for(String elemento : parole) {
			System.out.println(elemento.length());
		}
		
		for(Iterator<String> x = parole.iterator(); x.hasNext();) { //i due for sono identici
			String st = x.next();
			System.out.println(st.length());
		}
		
		Persona p1 = new Persona("Mario", "Rossi", "abc");
		Persona p2 = new Persona("Giorgio", "Verdi", "xyz");
		Persona p3 = new Persona("Mario", "Rossi", "abc");
		
		Set<Persona> persone = new HashSet<>();
		persone.add(p1);
		persone.add(p2);
		persone.add(p3);
		System.out.println(persone.size()); //da 3 perchè compara gli indirizzi
	}
	
	public static void f(List<String> lista) {
		
	}
	
	public static void g(List lista) {
		lista.add(22); //posso aggiungere qualsiasi oggetto, aggiro il compilatore //il compilatore crea un nuovo oggetto, non una primitiva
	}
}






/*
 * non devo dare lunghezza fissa ad arrayList
 * caratteristica base degli array: ha elementi dello stesso tipo e dimensione, gli elementi sono sequenziali in memoria
 * vantaggio degli array: il random access è o grande di 1
 * array e array list hanno performance 1 per il random access. qual è il prezzo da pagare? voglio che i miei elementi siano sequenziali e quando rimuovo o inserisco un elemento devo spostare gli altri
 * per rimozione o inserimento devo fare o grande di n 
 * 
 * linkedList tiene gli elementi in memoria.
 * offre alta performance in inserimento/rimozione di dati.
 * ogni elemento ha l'indirizzo dell'elemento che gli viene dopo, quindi la performance è o grande di 1, ma per fare l'accesso il random access è o grande di n
 * -> uso foreach nelle liste
 * le collection inizialmente erano generali linkedList e arrayList
 */
