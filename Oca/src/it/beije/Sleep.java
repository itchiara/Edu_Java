package it.beije;

public class Sleep {
	public static void snore()  {
		
		try {
			String sheep[] = new String[3];
			System.out.print(sheep[3]);
		} catch (RuntimeException e) {
			System.out.print("Awake!");
			try {
				throw new Error();
			} finally {
				System.out.println("chissene");
			}
			
		} finally {
			 // x1
		}
	}

	// missing new
	public static void main(String... sheep)  { // x2
		new Sleep().snore(); // x3
		
	}
}
