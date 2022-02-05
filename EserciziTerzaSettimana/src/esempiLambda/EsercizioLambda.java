package esempiLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EsercizioLambda {

	public static void main(String[] args) {
		List<Libro> listaLibro = new ArrayList<Libro>();
		listaLibro.add(new Libro(100, "bvew"));
		listaLibro.add(new Libro(30, "vew"));
		listaLibro.add(new Libro(10, "bve"));
		listaLibro.add(new Libro(190, "bvw"));
		List<Libro> x = listaLibro.stream().filter(p -> p.getPrezzo() > 100).collect(Collectors.toList());
		
		System.out.println(x);

	}

}
