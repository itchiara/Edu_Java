package esercizio30303;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	
	List<Presenza> l1 = new ArrayList<Presenza>();
	
	public void popola(Presenza e) {
		l1.add(e);
	}
	
	public void writeFile(File f) throws IOException {
		f.createNewFile();
		for (int i = 0; i < l1.size(); i++) {
			String x = l1.get(i).toString();
			FileUtils.writeStringToFile(f, x, "UTF-8", true);
		}
		
	}
	
	public void readFile(File f) throws IOException {
		String x = FileUtils.readFileToString(f, "UTF-8");
		System.out.println(x);
	}
	
	

	
}

