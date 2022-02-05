package it.epicode.be.capitolo6;

public class PrimeGenerator {

	private int n;
	
	
	
	public PrimeGenerator(int n) {
		this.n = n;
	}



	public void nextPrime() {
		int primo = 1;
		for(int i = 1; i < n; i++) {
			if(primo%primo==0 && primo%1==0) {
				System.out.println(primo);
			}
		}
	}
	
//	2
//	3
//	5
//	7
//	11
//	13
//	17
//	19
}

