package it.epicode.be.capitolo1;

public class Start {

	public static Integer xx;

	public static void doChange(Integer a) {
		a = 2;
	}

//	public static void bo(Dog d) {
//		d.getNome().equals("Ciccio"); 
//		d = new Dog("Pasticcio");
//		d.getNome().equals("Pasticcio"); 
//		//d.setNome("Fifi");
//	}
	public static int someMethod1(int i) {  
		++i;
		System.out.println("stampo"+i);
        return i; 
    }

	public static void main(String[] args) {
		int i = 5; 
        someMethod1(i); 
        System.out.println("valore"+i);
		
//		Dog aDog = new Dog("Ciccio");
//		Dog oldDog = aDog;
//
//		bo(aDog);
//		aDog.getNome().equals("Ciccio"); 
//		aDog.getNome().equals("Pasticcio"); 
//		aDog.equals(oldDog);

		xx = 1;
		doChange(xx);
		System.out.println(xx);

//		int x = 7;//8
//		int y = 9;//3
//		System.out.println(x + " " + y);
//		x = x + y + x; //14
//		y= x - y; //6
//		x -=y;
//		y/=2;

//		System.out.println(x);
//		System.out.println(y);

//		String carina = new String("carina");
//		System.out.println(carina);
//		carina = null;
//		System.out.println(carina);
//		String bella = "carina";
//		System.out.println(carina.hashCode());
//		System.out.println(bella.hashCode());
//		System.out.println(carina.equals(bella));

//		System.out.println("Hello World");
//		System.out.println("| - - - -|");
//		System.out.println("| Chiara |");
//		System.out.println("| - - - -|");
//		System.out.println("           CCCCCCCCCC");
//		System.out.println("        CCCCCCCC");
//		System.out.println("     CCCCCCC");
//		System.out.println("  CCCCC");
//		System.out.println(" CCC");
//		System.out.println(" CCC");
//		System.out.println(" CCC");
//		System.out.println("CC");
//		System.out.println(" CCC");
//		System.out.println(" CCC");
//		System.out.println(" CCC");
//		System.out.println("  CCCCC");
//		System.out.println("     CCCCCCC");
//		System.out.println("     CCCCCC");
//		System.out.println("        CCCCCCCC");
//		System.out.println("           CCCCCCCCCC");
	}

}
