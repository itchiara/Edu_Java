package esercizioThread20303;

import java.util.ArrayList;
import java.util.List;

public class ThreadPrincipale{

	List<Integer> lista = creaNumeri();
	
	public static List<Integer> creaNumeri() {
		List<Integer> numeri = new ArrayList<Integer>();
		for (int i = 0; i < 3000; i++) {
			double x = (Math.random() * 101);
			numeri.add((int) x);
		}
		return numeri;
	}

}
