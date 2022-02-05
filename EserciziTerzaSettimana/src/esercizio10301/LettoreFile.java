package esercizio10301;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LettoreFile {
	public static void main(String[] args) {
		try {
			List<String> lineeFile = leggiFile("Pippo.txt");
			for (int i = 0; i < lineeFile.size(); i++) {
				System.out.println(lineeFile.get(i));
			}
		} catch (FileNotFoundException fe) {
			System.out.println("Il file non esiste");
		} catch (IOException ioe) {
			System.out.println("Errore nella lettura del file");
		}

	}

	public static List<String> leggiFile(String fileName) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		List<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) {
			lines.add(line);
		}
		return lines;
	}
}
