package threads0303;

public class BuongiornoRunnable implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Buongiorno Runnable");
		}
	}
}
