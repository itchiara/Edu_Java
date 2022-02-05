package esercizioThread10303;

public class Start {

	public static void main(String[] args) {
		
		Thread t1 = new SimboloUno();
		Thread t2 = new SimboloDue();
		t1.start();
		t2.start();
		 

	}

}
