package esercizioCompiti30302;

public class Start {
	public static void main(String[] args) {
		Elenco elenco = new Elenco();
		elenco.add("Mario", 0643264);
		elenco.add("Mattia", 765362);
		elenco.add("Aldo", 123530);
		elenco.remove("Mattia");
		elenco.searchName(0643264);
		elenco.searchTel("Aldo");
		elenco.printContacts();
		
	}
	
	
	
	
}
