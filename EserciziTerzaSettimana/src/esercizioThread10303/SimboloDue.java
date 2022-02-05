package esercizioThread10303;

import java.util.concurrent.TimeUnit;

public class SimboloDue extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("#");
			try {
				TimeUnit.SECONDS.sleep(1);		
			} catch (InterruptedException e) { 		
				e.printStackTrace();
			}
		}
	}
}
