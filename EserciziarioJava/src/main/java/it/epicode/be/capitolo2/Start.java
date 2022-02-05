package it.epicode.be.capitolo2;

public class Start {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo();
		System.out.println(r1);
		System.out.println("area" + r1.calcolaArea());
		System.out.println("perimetro" + r1.calcolaPerimetro());
		Rettangolo r2 = new Rettangolo(2, 4.6, 7.3, 1.9);
		System.out.println(r2);
		System.out.println("area" +r2.calcolaArea());
		System.out.println("perimetro" +r2.calcolaPerimetro());
		
		Dado d1 = new Dado(6);
		System.out.println(d1.lanciaDado());
		
		Dado d2 = new Dado(20);
		System.out.println(d2.lanciaDado());
	}

}
