package esercizioThread20303;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Start{

	public static void main(String[] args) {
		ListaUno a = new ListaUno();
		ListaDue b = new ListaDue();
		ListaTre c = new ListaTre();
//		Runnable r1 = new ListaUno();
//		Runnable r2 = new ListaDue();
//		Runnable r3 = new ListaTre();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(a.getSomma() + b.getSomma() + c.getSomma());
		
		
		
	}
	


}
