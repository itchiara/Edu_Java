package it.epicode.be.capitolo3;

public class ContoBancario {

	private double balance;
	private int password;
	
	public ContoBancario(int password) {
		this.password = password;
	}

	
	public ContoBancario(int password, double saldo) {
		this.password = password;
		this.balance = saldo;
	}
	
	private boolean controlPass(int pass) {
		if(password == pass) {
			return true;
		} else {
			System.out.println("Impossibile procedere");
			return false;
		}
	}
	
	public void preleva(double ammontare, int pass) {
		if(controlPass(pass)) {
			System.out.println("password corretta");
			if(balance>ammontare) {
				balance -= ammontare;
			} else {
				System.out.println("Saldo insufficiente");
			}
		} else {
			System.out.println("Non è possibile prelevare. Password errata.");
		}
	}
	
	public void versa(double ammontare, int passw) {
		if(controlPass(passw)) {
			System.out.println("password corretta");
			balance += ammontare;
		} else {
			System.out.println("Non è possibile versare. Password errata.");
		}
	}
	
	public double calcolaInteresse(int tasso, int pas) {
		if(controlPass(pas)) {
			System.out.println("password corretta");
			double interesse = balance * tasso / 100;
			System.out.println(interesse);
			return balance += interesse;
		} else {
			System.out.println("Impossibile svolgere l'operazione. Password errata.");
			return -1;
		}
	}
	
	public void stampaSaldoRimanente() {
		System.out.println(balance);
	}
}
