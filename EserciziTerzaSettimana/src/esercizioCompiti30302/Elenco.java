package esercizioCompiti30302;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Elenco {
	private Map<String, Integer> contatti = new HashMap<String, Integer>();

	
	public void add(String nome, int numTelefono) {
		contatti.put(nome, numTelefono);
	}
	
//	public String add1(String nome, int numTelefono) {
//		String oldValue = contatti.put(nome, numTelefono);
//		return oldValue;
//	}

	public void remove(String nome) {
		contatti.remove(nome);
	}
	
//	public String remove1(String nome) {
//		String removed = contatti.remove(nome);
//		return removed;
//	}

	public String searchName(int numero) {
		String x = "";
		for (Entry<String, Integer> contatto : contatti.entrySet()) {
			x = contatto.getKey();
		}
		return x;
		
		
//		for (Entry<String, Integer> contatto : contatti.entrySet()) {
//			if(contatto.getValue().equals(numero))
//			return contatto.getKey();
//		}
//		return "Nessun risultato";
	}

	public Integer searchTel(String nome) {
		return contatti.get(nome);
//		int tel = 0;
//		for (Entry<String, Integer> contatto : contatti.entrySet()) {
//			tel = contatto.getValue();
//		}
//		return tel;
	}

	public void printContacts() {
		for (Entry<String, Integer> contatto : contatti.entrySet()) {
			System.out.println(contatto);
//			System.out.println(contatto.getKey());
//			System.out.println(contatto.getValue());
		}

	}
}
