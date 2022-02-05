package threads0303;

public class EsempiThreads {

	public static void main(String[] args) {
		
//		Thread t1 = new BuongiornoThread();
//		Thread t2 = new BuonaseraThread();
//		
//		t1.start();
//		t2.start(); 		//funzionano in contemporanea
//		
//		try {
//			Thread.sleep(5000);		//sta ferma per 5s senza fare niente, mette in sleep il thread che è in esecuzione e che è la main
//		} catch (InterruptedException e) { 		//devo comunque fare try catch anche se so che quell'eccezione non sarà mai lanciata
//			e.printStackTrace();
//		} 
//		
//		try {
//			t1.join();	//la main aspetta t1, aspetta che t1 abbia finito, poi partirà t2. il thread main non muore, aspetta che finiscano t1 e t2 che continuano a funzionare insieme
//			t2.join();	//può essere 
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Main finita"); //questo è quello che succede dopo 5secondi
//		//una main è a sua volta una thread
//		
		
		Runnable r1 = new BuongiornoRunnable();
		Runnable r2 = new BuonaseraRunnable();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		Object portiere = new Object();
		
		Bagno b1 = new Bagno(portiere);
		Bagno b2 = new Bagno(portiere);
		
		b1.usaBagno(); //ognuno ha il suo lock e ogni thread esegue la funzione, sono due oggetti diversi
		b2.usaBagno();
		//con portiere nessun'altra thread può entrare, c'è una lock unica
		
	}

}
