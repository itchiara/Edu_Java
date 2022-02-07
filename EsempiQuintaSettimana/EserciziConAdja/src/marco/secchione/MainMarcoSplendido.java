package marco.secchione;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainMarcoSplendido {

	public static void main(String[] args) {

		ConnectionHandler c1 = new ConnectionHandler();

		Repository rep = new Repository(c1);

		Fornitore forn = new Fornitore(1, "pappone", "via pappone tre", "riomma");
		Fornitore marco = new Fornitore(2, "marco", "viastupendo", "benevento");
		Fornitore forn2 = new Fornitore(5, "licia", "via frattina", "rieti");
		Fornitore forn3 = new Fornitore(6, "chiara", "via l'amore", "valdobbiadene");
		List<Fornitore> listaFornitore= new ArrayList<>();
	    listaFornitore.add(new Fornitore(7, "costa", "nontivogliamo", "muscolandia"));
	    listaFornitore.add(new Fornitore(8, "mirko", "via passivo", "furiolandia"));
	    
	    
		try {
//			rep.updateTabella(forn);
//		    rep.inserisciFornitore(forn2);
//			rep.inserisciFornitore(forn3);
//			for(Fornitore l: listaFornitore) {
//			rep.inserisciFornitore(l);
//			rep.deleteFornitore(2);
//			rep.inserisciFornitore(marco);
//			System.out.println(rep.leggiPerCittà());
			System.out.println(rep.listaProdottiConFornitore());
//			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}