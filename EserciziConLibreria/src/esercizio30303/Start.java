package esercizio30303;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Start {

	public static void main(String[] args) throws FileNotFoundException {
		RegistroPresenze elenco = new RegistroPresenze();
		File prova = new File("/Users/Account/Desktop/p.text");
		File prov = new File("/Users/Account/p.text");
		
		Presenza p = new Presenza("Mario", 3);
		Presenza p1 = new Presenza("Luca", 5);
		Presenza p2 = new Presenza("Giacomo", 8);

		elenco.popola(p);
		elenco.popola(p1);
		elenco.popola(p2);

		try {
			elenco.writeFile(prova);
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			elenco.readFile(prova);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
