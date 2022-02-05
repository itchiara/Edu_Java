package esercizi0201;

public class Es1 {

	public static void main(String[] args) {
		String a = "bfnuifwb buveq buiv";
		
		boolean lengthCheck = isEven(a);
//		boolean lengthCheck = Es1.isEven(a);
//		Es1 x = new Es1();
//		boolean b = x.isEven(a);
        if (lengthCheck) {
            System.out.println("La stringa e' pari");
        }else {
            System.out.println("La stringa e' dispari");
        }
		isEven(a);
		
		int b = 2020;
		boolean yearCheck = isAnnoBisestile(b);
        if (yearCheck) {
            System.out.println("l'anno e' bisestile");
        }else {
            System.out.println("l'anno non e' bisestile");
        }

	}
	
	public static boolean isEven(String parola) {
		int length = parola.length();
		if(length%2 == 0) {
			//System.out.println("La stringa è pari");
			return true;
		} else {
			//System.out.println("La stringa è dispari");
			return false;
		}
	}
	
	public static boolean isAnnoBisestile(int anno) {
		if(anno%400 == 0) {
			//System.out.println("Anno bisestile");
			return true;
		} else if(anno%4 == 0 && anno%100 != 0) {
			//System.out.println("Anno bisestile");
			return true;
		} else {
			//System.out.println("Anno non bisestile");
			return false;
		}
	}

}
