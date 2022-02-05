package it.epicode.be.capitolo4;

public class SecondConverter {

	private static final int GIORNI_SECONDI = 86400;
	private static final int ORE_SECONDI = 3600;
	private static final int MINUTI_SECONDI = 60;
	private double secondi;
	private double secondiRimanenti;

	public SecondConverter(double secondi) {
		this.secondi = secondi;
	}

	public void calcola() {
		if (secondi >= GIORNI_SECONDI) {
			System.out.println(calcolaGiorni());
		} else if (secondi >= ORE_SECONDI) {
			System.out.println(calcolaOre());
		} else if (secondi >= MINUTI_SECONDI) {
			System.out.println(calcolaMinuti());
		} else {
			System.out.println("secondi" + secondi);
		}
	}
	
	private String calcolaMinuti() {
		int calcoloMinutiSecondi = (int) (secondi / MINUTI_SECONDI);
		secondiRimanenti = secondi % MINUTI_SECONDI;
		if (secondiRimanenti > 0) {
			double calcoloSecondiRimasti = secondiRimanenti;
			return " minuti: " + calcoloMinutiSecondi + " secondi: " + calcoloSecondiRimasti;
		} else {
			return " minuti: " + calcoloMinutiSecondi;
		}
	}
	
	private String calcolaOre() {
		int calcoloOreSecondi = (int) (secondi / ORE_SECONDI);
		secondiRimanenti = secondi % ORE_SECONDI;
		if (secondiRimanenti >= 60) {
			int calcoloMinutiSecondi = (int) (secondiRimanenti / MINUTI_SECONDI);
			secondiRimanenti = secondiRimanenti % MINUTI_SECONDI;
			if (secondiRimanenti > 0) {
				double calcoloSecondiRimasti = secondiRimanenti;
				return " ore: " + calcoloOreSecondi + " minuti: " + calcoloMinutiSecondi + " secondi: "
						+ calcoloSecondiRimasti;
			} else {
				return " ore: " + calcoloOreSecondi + " minuti: " + calcoloMinutiSecondi;
			}
		} else if (secondiRimanenti < 60 && secondiRimanenti > 0) {
			double calcoloSecondiRimasti = secondiRimanenti;
			return " ore: " + calcoloOreSecondi + " secondi: " + calcoloSecondiRimasti;
		} else {
			return "ore: " + calcoloOreSecondi;
		}
	}
	
	private String calcolaGiorni() {
		int calcoloGiorniSecondi = (int) (secondi / GIORNI_SECONDI);
		secondiRimanenti = secondi % GIORNI_SECONDI;
		if (secondiRimanenti >= 3600) {
			int calcoloOreSecondi = (int) (secondiRimanenti / ORE_SECONDI);
			secondiRimanenti = secondiRimanenti % ORE_SECONDI;
			if (secondiRimanenti >= 60) {
				int calcoloMinutiSecondi = (int) (secondiRimanenti / MINUTI_SECONDI);
				secondiRimanenti = secondiRimanenti % MINUTI_SECONDI;
				if (secondiRimanenti > 0) {
					double calcoloSecondiRimasti = secondiRimanenti;
					return "giorni: " + calcoloGiorniSecondi + " ore: " + calcoloOreSecondi + " minuti: "
							+ calcoloMinutiSecondi + " secondi: " + calcoloSecondiRimasti;
				} else {
					return "giorni: " + calcoloGiorniSecondi + " ore: " + calcoloOreSecondi + " minuti: "
							+ calcoloMinutiSecondi;
				}

			} else if (secondiRimanenti < 60 && secondiRimanenti > 0) {
				double calcoloSecondiRimasti = secondiRimanenti;
				return "giorni: " + calcoloGiorniSecondi + " ore: " + calcoloOreSecondi + " secondi: "
						+ calcoloSecondiRimasti;
			} else {
				return "giorni: " + calcoloGiorniSecondi + " ore: " + calcoloOreSecondi;
			}
		} else if (secondiRimanenti < 3600 && secondiRimanenti > 0) {
			int calcoloMinutiSecondi = (int) (secondiRimanenti / MINUTI_SECONDI);
			secondiRimanenti = secondiRimanenti % MINUTI_SECONDI;
			if (secondiRimanenti > 0) {
				double calcoloSecondiRimasti = secondiRimanenti;
				return "giorni: " + calcoloGiorniSecondi + " minuti: " + calcoloMinutiSecondi + " secondi: "
						+ calcoloSecondiRimasti;
			} else {
				return "giorni: " + calcoloGiorniSecondi + " minuti: " + calcoloMinutiSecondi;
			}
		} else {
			return "giorni: " + calcoloGiorniSecondi;
		}
	}

}
