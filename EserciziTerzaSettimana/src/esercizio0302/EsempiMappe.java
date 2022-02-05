package esercizio0302;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EsempiMappe {
	
	public static void main(String[] args) {
		List<Integer> numeri = new ArrayList<>();
		numeri.add(3);
		numeri.add(200);
		numeri.add(-2);
		
		for (Integer n : numeri) {
			System.out.println(n);
		}
		
		Collections.sort(numeri);
		
		for (Integer n : numeri) {
			System.out.println(n);
		}
		
		Map<String, Persona> mappa = new HashMap<String, Persona>();
		Persona p1 = new Persona("Mario", "Rossi", "abc");
		Persona p2 = new Persona("Giorgio", "Verdi", "xyz");
		Persona p3 = new Persona("Mario", "Rosso", "abc");
		
		//mappa.put(p1.getCodiceFIscale(), p1); //put = inserisco in mappa
		mappa.put(p2.getCodiceFIscale(), p2);
		mappa.put(p3.getCodiceFIscale(), p3); //sovrascrive la coppia precedente
		
		Persona x = mappa.get("abc");
		System.out.println(x.getCognome());
		
//		for(String codice : mappa.keySet()) {
//			System.out.println(codice);
//			System.out.println(mappa.get(codice));
//		}
		
		for(Persona p : mappa.values()) {
			System.out.println(p);
		}
		
		for(Map.Entry<String, Persona> kv : mappa.entrySet()) {
			System.out.println(kv.getClass().getName());
			System.out.println(kv);
			System.out.println(kv.getKey());
			System.out.println(kv.getValue());
		}
	}
}
